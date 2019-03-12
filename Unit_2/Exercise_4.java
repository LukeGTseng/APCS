package Unit_2;

import java.util.Scanner;

public class Exercise_4 {
	public static void main(String[] args) {
		System.out.println("Enter something: ");
		String input = inputReturn();
		System.out.println(input);
	}
	
	
	public static String inputReturn() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
}
