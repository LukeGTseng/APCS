package arrayLists;

import java.util.*;

public class Employee {
	private String id;
	private String name;
	private String birthday;
	ArrayList<String> skills = new ArrayList<String>();
	ArrayList<String> projects = new ArrayList<String>();
	
	public static Employee readFromFile(String employee) {
		Scanner Pog = new Scanner(employee).useDelimiter(";");
		Employee JimJPoggers = new Employee();
		JimJPoggers.id = Pog.next();
		JimJPoggers.name = Pog.next();
		JimJPoggers.birthday = Pog.next();
		Scanner skillz = new Scanner(Pog.next()).useDelimiter(",");
		while(skillz.hasNext()) {
			JimJPoggers.skills.add(skillz.next());
		}
		Scanner projectz = new Scanner(Pog.next()).useDelimiter(",");
		while(projectz.hasNext()) {
			JimJPoggers.projects.add(projectz.next());
		}
		return JimJPoggers;
	}
	
}
