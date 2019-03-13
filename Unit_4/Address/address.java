package Address;

import java.util.*;

public class address {
	private String name;
	private String address;
	private String city;
	private String state;
	private int day;
	private int month;
	private int year;
	private static int addresses = 0;
	Scanner s = new Scanner(System.in);

	public static apples readFromInput() { // class information input method
		apples newAddress = new apples();
		System.out.println("Enter Person's Name: ");
		newAddress.addName();
		System.out.println("Enter Person's Address: ");
		newAddress.addAddress();
		System.out.println("City?");
		newAddress.addCity();
		System.out.println("State?");
		newAddress.addState();
		System.out.println("Enter Person's Birthday: ");
		newAddress.addBirthday();
		addresses++;
		return newAddress;
	}

	// input methods for everything
	public void addName() {
		name = s.nextLine();
	}

	public void addAddress() {
		address = s.nextLine();
	}

	public void addCity() {
		city = s.nextLine();
	}

	public void addState() {
		state = s.nextLine();
	}

	public void addBirthday() {
		System.out.println("Month: ");
		month = s.nextInt();
		System.out.println("Day: ");
		day = s.nextInt();
		System.out.println("Year: ");
		year = s.nextInt();
	}

	// formatting methods
	public String birthdayFormat() {
		return String.format("%d/%d/%d", month, day, year);
	}


	public String addressFormat() {
		return String.format("%s, %s, %s", address, city, state);
	}

	public static int getAddresses() {
		return addresses;
	}

	public String getName() {
		return name;
	}

	public void printAddressFormat(apples apples) {
		System.out.printf("Name: %s\nAddress: %s\nBirtyday: %s\n", apples.getName(), apples.addressFormat(), apples.birthdayFormat());

	}
}
