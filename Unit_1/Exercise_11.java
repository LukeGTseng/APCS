package Unit_1;

import java.util.Scanner;

public class Exercise_11 {
	public static void main(String[] args) {
		int number;
		System.out.println("Enter a 3 digit number to reverse:");
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		int a = number%10;
		number = number/10;
		int b = number%10;
		int c = number/10;
		int reversedNum = (a*100) + (b*10) + c;
		System.out.println("The reversed number is "+reversedNum);
	} 
}
