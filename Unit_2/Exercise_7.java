package Unit_2;

import java.util.Scanner;

public class Exercise_7 {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int input = inputReturn();
		evenOddChecl(input);
	}
	
	public static int inputReturn() {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}
	public static void evenOddCheck(int a) {
		if(a%2==0) {
			System.out.println("That number is even!");
		} else {
			System.out.println("That number is odd!");
		}
	}
}
