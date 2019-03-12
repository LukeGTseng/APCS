package Unit_1;

import java.util.Scanner;

public class Exercise_13 {
	public static void main(String[] args) {
		Double a, b, c;
		double d = 0.0;
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		a = s.nextDouble();
		d += a;
		System.out.println("Enter a number");
		Scanner t = new Scanner(System.in);
		b = t.nextDouble();
		d += b;
		System.out.println("Enter a number");
		Scanner u = new Scanner(System.in);
		c = u.nextDouble();
		d += c;
		d= d/3;
		System.out.println("The average is " + d);
	}
}
