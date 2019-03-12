import java.util.*;
class main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		apples[] totalAddresses = null;
		ArrayList<apples> list = new ArrayList<apples>();
		for (;;) {
			System.out.println(
					"Type \"1\" to create a new address\nType \"2\" to get details about all people\nType \"3\" to get details on a specific person\nType \"4\" to list total amount of people in the address book");
			int num = s.nextInt();
			if (num == 1) {
				list.add(apples.readFromInput());
				totalAddresses = list.toArray(new apples[list.size()]);
			} else if (num == 2) {
				if (totalAddresses == null) {
					System.out.println("You have not created any addresses yet!!!");
				} else {
					for (int i = 0; i < totalAddresses.length; i++) {
						totalAddresses[i].printAddressFormat(totalAddresses[i]);
						System.out.println();
					}
				}
			} else if (num == 3) {
				if (totalAddresses == null) {
					System.out.println("You have not created any addresses yet!!!");
				} else {
					Boolean addressFound = false;
					System.out.print("Type which person you want details on: ");
					for (int i = 0; i < totalAddresses.length; i++) {
						System.out.print("\n" + totalAddresses[i].getName());
					}
					System.out.println();
					Scanner input = new Scanner(System.in);
					String selectedAddress = input.nextLine();
					for (int i = 0; i < totalAddresses.length; i++) {
						if (selectedAddress.equals(totalAddresses[i].getName())) {
							totalAddresses[i].printAddressFormat(totalAddresses[i]);
							addressFound = true;
						}
					}
					if (addressFound == false) {
						System.out.println("Address not found!!!");
					}
				}
			} else if (num == 4) {
				System.out.printf("Number of People in Address Book: %d\n", apples.getAddresses());
			}
		}
	}
}
