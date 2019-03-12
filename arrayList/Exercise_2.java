package arrayLists;

import java.io.*;
import java.util.*;

public class Exercise_2 {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Employee> EmployeeList= new ArrayList<Employee>();
		File myFile = new File("employee.txt");
		Scanner s = new Scanner(myFile);
		while(s.hasNextLine()) {
			Employee.readFromFile(s.nextLine());
		}
	}
}
