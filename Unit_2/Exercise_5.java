package Unit_2;

import java.util.Scanner;

public class Exercise_5 {
	public static void main(String[] args) {
		System.out.print("Please enter your first name: ");
		String first = inputReturn();
		System.out.print("Please enter your last name: ");
		String last = inputReturn();
		System.out.println("Your name in reverse order is: " + last + ", " + first);
	}	
	public static String inputReturn() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
}
