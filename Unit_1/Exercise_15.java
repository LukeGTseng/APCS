package Unit_1;

import java.util.Scanner;

public class Exercise_15 {
	public static void main(String[] args) {
		int result = 1;
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in); //gets the input of the number that is getting factorial
		int input = s.nextInt();
		for(int i = input; i>0;i--) {
			result *= i; //this multiplies every number below the input which result in the factorial
		}
		System.out.println("The factorial of " + input + " is " + result);
	}
}
