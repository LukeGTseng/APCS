package Unit_2;

import java.util.Scanner;

public class Exercise_2 {
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner s = new Scanner(System.in);
		String front = s.nextLine();
		System.out.println("Enter another String: ");
		Scanner t = new Scanner(System.in);
		String back = t.nextLine();
		System.out.println(interweave(front, back)); // prints out the return of interweave with the parameters from the
														// input
	}

	public static String interweave(String a, String b) {
		int blen = b.length();
		int alen = a.length();
		String result = "";
		for (int i = 0; i < Math.min(alen, blen); i++) {
			result += a.substring(i, i + 1);
			result += b.substring(i, i + 1);
		}
		if (alen > blen) {
			return result + a.substring(blen, alen);
		} else if (blen > alen) {
			return result + b.substring(alen, blen);
		} else {
			return result;
		}
	}
}
