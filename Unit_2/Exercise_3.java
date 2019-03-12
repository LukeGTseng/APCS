package Unit_2;

import java.util.Scanner;

public class Exercise_3 {
	public static String name = getName();
	public static String addr = getAddr();
	public static int id = getId();

	public static String getName() { // gets the name
		String a;
		System.out.println("Enter your Name:");
		Scanner s = new Scanner(System.in);
		a = s.nextLine();
		return a;
	}

	public static String getAddr() { // gets the address
		String a;
		System.out.println("Enter your Address:");
		Scanner s = new Scanner(System.in);
		a = s.nextLine();
		return a;
	}

	public static int getId() { // gets the student id
		int a;
		System.out.println("Enter your Student ID:");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		return a;
	}

	public static void Library() {
		System.out.println(name);
		System.out.println(id);
	}

	public static void printAddress() {
		System.out.println(addr);
	}

	public static void printname() {
		System.out.println(name);
		System.out.println(addr);
		System.out.println(id);
	}

	public static void main(String[] args) {
		System.out.println("To seng me a letter");
		printAddress(); // To send me a letter
		System.out.println("To check out a book at the library");
		Library(); // To check out a book at the library
		System.out.println("To find my school transcript");
		printname(); // To find my school transcript
	}
}
