package Unit_1;

import java.util.Scanner;

public class Exercise_9 {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter a String");
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		if(str.length()<5) {
			System.out.println("Needs to be 5 or more letters.");
		} else {
			System.out.println(str.substring(0, 5));
			System.out.println(str.substring(str.length()-5, str.length()));
		}
	}
}
