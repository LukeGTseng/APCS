package Unit_2;

import java.util.Scanner;

public class Exercise_10 {
	
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		int x = inputReturn();
		int y = inputReturn();
		if(isEven(x)==true&&isEven(y)==true) {
			System.out.println("both are true");
		}
	}
	
	public static int inputReturn() {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}
	public static boolean isEven(int a) {
		if(a%2==0) {
			return true;
		} else {
			return false;
		}
	}
}
