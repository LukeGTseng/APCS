package School;

import java.util.*;

public class mooSchool {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		School[] totalClasses = null;
		ArrayList<School> list = new ArrayList<School>();
		for (;;) {
			System.out.println("Type \"1\" to create a new class" + "\nType \"2\" to add a student to the class"
					+ "\nType \"3\" to get details about all the classes"
					+ "\nType \"4\" to get details on a specific class" + "\nType \"5\" to list total amount of classes"
					+ "\nType \"6\" to check what classes a specific student is taking");
			int num = s.nextInt();
			if (num == 1) {
				list.add(School.readFromInput());
				totalClasses = list.toArray(new School[list.size()]); // got some help with example code

			} else if (num == 2) {
				if (totalClasses == null) {
					System.out.println("You haven't created any classes yet!!!");
				} else {
					Boolean courseFound = false;
					System.out.print("Type which class you want to add a student in: ");
					for (int i = 0; i < totalClasses.length; i++) { // for loop to get every class made
						System.out.print("\n" + totalClasses[i].getCourseName());
					}
					System.out.println();
					Scanner input = new Scanner(System.in);
					String selectedClass = input.nextLine();
					for (int i = 0; i < totalClasses.length; i++) { // another for loop to test which class the user
																	// picked
						if (selectedClass.equals(totalClasses[i].getCourseName())) {
							totalClasses[i].addStudent(totalClasses[i]);
							courseFound = true;
						}
					}
					if (courseFound == false) { // if the class is not found, this if statement will run
						System.out.println("Class not found!!!");
					}
				}
			} else if (num == 3) {
				if (totalClasses == null) {
					System.out.println("You have not created any classes yet!!!");
				} else {
					for (int i = 0; i < totalClasses.length; i++) { // quick for loop to print out every class
						totalClasses[i].printClassFormat(totalClasses[i]);
						System.out.println();
					}
				}
			} else if (num == 4) {
				if (totalClasses == null) {
					System.out.println("You have not created any classes yet!!!");
				} else {
					Boolean courseFound = false;
					System.out.print("Type which class you want details on: ");
					for (int i = 0; i < totalClasses.length; i++) { // for loop to get every class made
						System.out.print("\n" + totalClasses[i].getCourseName());
					}
					System.out.println();
					Scanner input = new Scanner(System.in);
					String selectedClass = input.nextLine();
					for (int i = 0; i < totalClasses.length; i++) { // another for loop to test which class the user
																	// picked
						if (selectedClass.equals(totalClasses[i].getCourseName())) {
							totalClasses[i].printClassFormat(totalClasses[i]);
							courseFound = true;
						}
					}
					if (courseFound == false) { // if the class is not found, this if statement will run
						System.out.println("Class not found!!!");
					}
				}
			} else if (num == 5) {
				System.out.printf("Number of Classes: %d\n", School.getTotalCourses());
			} else if (num == 6) {
				String classList = "This student is in classes: ";
				Boolean studentFound = false;
				System.out.print("Type which student you want details on: ");
				for (int i = 0; i < School.getAllStudents().length; i++) { // for loop to get every student made
					System.out.print("\n" + School.getAllStudents()[i]);
				}
				System.out.println();
				Scanner input = new Scanner(System.in);
				String selectedStudent = input.nextLine();
				for (int i = 0; i < School.getAllStudents().length; i++) { // another for loop to test which student the
																			// user picked
					if (selectedStudent.equals(School.getAllStudents()[i])) {
						for (int j = 0; j < totalClasses.length; j++) {
							if (totalClasses[j].getStudents() != null) {
								if (findStudent(totalClasses[j].getStudents(), School.getAllStudents()[i]) == true) {
									classList += totalClasses[j].getCourseName();
									classList += ", ";
								}
							}
						}
					}
					studentFound = true;
				}
				if (!classList.equals("This student is in classes: ")) {
					classList = classList.substring(0, classList.length() - 2);
					System.out.println(classList);
				} else {
					System.out.println("This student is not in any classes!!!");
				}
				if (studentFound == false) { // if the student is not found, this if statement will run
					System.out.println("Student not found!!!");
				}
			}
		}
	}

	public static boolean findStudent(String[] arr, String student) {
		for (String s : arr) {
			if (s.equals(student))
				return true;
		}
		return false;
	}
}
