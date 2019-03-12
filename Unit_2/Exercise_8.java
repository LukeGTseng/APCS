package Unit_2;

import java.util.Scanner;

public class Exercise_8 {
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		String word = strReturn();
		System.out.println("Enter a number: ");
		int input = inputReturn();
		checkLength(word,input);
	}
	
	public static int inputReturn() {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}
	public static String strReturn() {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		return input;
	}
	public static void checkLength(String str, int a) {
		if(str.length()>a) {
			System.out.println("The String length is greater than the number");
		} else if(str.length()<a) {
			System.out.println("The String length is less than the number");
		} else {
				System.out.println("The String length is equal to the number");
		}
	}
}
