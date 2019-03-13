package Unit_2;

import java.util.Scanner;

public class Exercise_1 {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in); // gets input for amount of stars
		int stars = s.nextInt();
		printLineOfStars(stars);
	}

	public static void printLineOfStars(int numStars) {
		for (int i = 1; i <= numStars; i++) { // prints out a square of stars with the same amount of stars as the lines
			for (int j = 1; j <= numStars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= numStars; i++) { // prints out a triangle of stars instead by having the amount of stars as
												// the line number
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
