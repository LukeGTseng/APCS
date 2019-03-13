import java.util.*;

public class School {
// field for all variables
	private String courseName;
	private String teacherName;
	private int roomNumber;
	private int period;
	private static int numOfCourses;
	private final static int MAX_CLASS_SIZE = 3;
	private String[] students;
	private static String[] allStudents;
	ArrayList<String> list = new ArrayList<String>();
	static ArrayList<String> list2 = new ArrayList<String>();
	Scanner s = new Scanner(System.in);

	public static School readFromInput() { // class information input method
		School newSchool = new School();
		System.out.println("Enter the Course Name: ");
		newSchool.addCourse();
		System.out.println("Enter the Teacher Name: ");
		newSchool.addTeacher();
		System.out.println("Enter the Room Number: ");
		newSchool.addRoom();
		System.out.println("Enter the Period: ");
		newSchool.addPeriod();
		numOfCourses++;
		return newSchool;
	}

// input methods for everything
	public void addCourse() {
		courseName = s.nextLine();
	}

	public void addTeacher() {
		teacherName = s.nextLine();
	}

	public void addRoom() {
		roomNumber = s.nextInt();
	}

	public void addPeriod() {
		period = s.nextInt();
	}

	public void addStudent(School school) {
		Scanner studentNameInput = new Scanner(System.in);
		if (isClassFull(school) == false) { // checking if class is full by using the method that checks the amount of
											// students
			System.out.println("Enter Student's Name: ");
			String student = studentNameInput.nextLine();
			list.add(student);
			students = list.toArray(new String[list.size()]); // shout out to IMLame for the help
			addAllStudents(student);
		}
	}

	public static void addAllStudents(String student) {
		if (allStudents == null) {
			list2.add(student);
			allStudents = list2.toArray(new String[list2.size()]);
		} else {
			int check = 0;
			for (int i = 0; i < allStudents.length; i++) {
				if (allStudents[i].equals(student)) {
					check++;
				}
			}
			if(check == 0) {
				list2.add(student);
				allStudents = list2.toArray(new String[list2.size()]);
			}
		}
	}

	public static int getTotalCourses() {
		return numOfCourses; // used for function 4 which prints out the total number of classes made
	}

	public String getCourseName() {
		return courseName; // used to find classes by name
	}

	public String getTeacher() {
		return teacherName; // used to find the teacher name
	}

	public int getRoom() {
		return roomNumber; // used to find the room number
	}

	public int getPeriod() {
		return period; // used to find the period
	}

	public String[] getStudents() {
		return students;
	}

	public static String[] getAllStudents() {
		return allStudents;
	}

	public void printClassFormat(School schools) { // format for printing out class details

		String studentNames = "";
		if (schools.getStudents() != null) {
			for (int i = 0; i < schools.getStudents().length; i++) {
				studentNames += schools.getStudents()[i];
				studentNames += ", ";
			}
			studentNames = studentNames.substring(0, studentNames.length() - 2);
		}
		if (studentNames.equals("")) {
			studentNames = "None";
		}
		System.out.printf("Course: %s\nTeacher: %s\nRoom: %d\nPeriod:%d\nStudents: %s\n", schools.getCourseName(),
				schools.getTeacher(), schools.getRoom(), schools.getPeriod(), studentNames);

	}

	public static boolean isClassFull(School school) {
		if (school.getStudents() == null) { // checking if array is empty
			return false;
		} else if (school.getStudents() != null && school.getStudents().length < MAX_CLASS_SIZE) { // testing if its in
																									// class size range
			return false;
		} else {
			System.out.println("Class Full!");
			return true;
		}
	}

}
