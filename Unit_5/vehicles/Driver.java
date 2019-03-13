package vehicles;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Vehicle[] totalVehicles = null;
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		// Vehicle a = new Truck(); works
		// Vehicle b = new Car(); works
		// Vehicle c = new Vehicle(); works
		// Car d = new Car(); works
		// Truck e = new Truck(); works
		// Car f = new Vehicle(); won't compile
		// Car g = new Truck(); won't compile
		// Truck h = new Car(); won't compile
		// Truck i = new Vehicle(); won't compile
		Scanner s = new Scanner(System.in);
		for (;;) {
			System.out.println("Type \"1\" to create a new vehicle\n" 
					+ "Type \"2\" to start a vehicle\n"
					+ "Type \"3\" to stop a vehicle\n" 
					+ "Type \"4\" to turn a vehicle\n"
					+ "Type \"5\" to increase speed of a vehicle\n" 
					+ "Type \"6\" to decrease speed of a vehicle\n"
					+ "Type \"7\" to check current speed of a vehicle\n"
					+ "Type \"8\" to get the gas milelage of a vehicle\n" 
					+ "Type \"9\" to get the weight of a vehicle\n"
					+ "Type \"10\" to open the trunk/tailgate a vehicle\n"
					+ "Type \"11\" to close the trunk/tailgate a vehicle\n"
					+ "Type \"12\" to list out total number of vehicles");
			int num = s.nextInt();
			if (num == 1) {
				System.out.println("Do want to create a new car or truck?");
				String select = s.next();
				if (select.equals("car")) {
					list.add(Car.readFromInput());
					totalVehicles = list.toArray(new Vehicle[list.size()]);

				} else if (select.equals("truck")) {
					list.add(Truck.readFromInput());
					totalVehicles = list.toArray(new Vehicle[list.size()]);
				} else {
					System.out.println("Not an option");
				}
			} else if (num == 2) {
				Boolean vehicleFound = false;
				System.out.print("Type which vehicle you want to start: ");
				for (int i = 0; i < totalVehicles.length; i++) {
					System.out.print("\n" + totalVehicles[i].getPlate());
				}
				System.out.println();
				Scanner input = new Scanner(System.in);
				String selectedVehicle = input.nextLine();
				for (int i = 0; i < totalVehicles.length; i++) {
					if (selectedVehicle.equals(totalVehicles[i].getPlate())) {
						totalVehicles[i].start();
						vehicleFound = true;
					}
				}
				if (vehicleFound == false) {
					System.out.println("License Plate not found!!!");
				}
			} else if (num == 3) {
				Boolean vehicleFound = false;
				System.out.print("Type which vehicle you want to stop: ");
				for (int i = 0; i < totalVehicles.length; i++) {
					System.out.print("\n" + totalVehicles[i].getPlate());
				}
				System.out.println();
				Scanner input = new Scanner(System.in);
				String selectedVehicle = input.nextLine();
				for (int i = 0; i < totalVehicles.length; i++) {
					if (selectedVehicle.equals(totalVehicles[i].getPlate())) {
						totalVehicles[i].stop();
						vehicleFound = true;
					}
				}
				if (vehicleFound == false) {
					System.out.println("License Plate not found!!!");
				}
			} else if (num == 4) {
				Boolean vehicleFound = false;
				System.out.print("Type which vehicle you want to stop: ");
				for (int i = 0; i < totalVehicles.length; i++) {
					System.out.print("\n" + totalVehicles[i].getPlate());
				}
				System.out.println();
				Scanner input = new Scanner(System.in);
				String selectedVehicle = input.nextLine();
				for (int i = 0; i < totalVehicles.length; i++) {
					if (selectedVehicle.equals(totalVehicles[i].getPlate())) {
						totalVehicles[i].turn();
						vehicleFound = true;
					}
				}
				if (vehicleFound == false) {
					System.out.println("License Plate not found!!!");
				}
			} else if (num == 5) {
				Boolean vehicleFound = false;
				System.out.print("Type which vehicle you want to increase the speed of: ");
				for (int i = 0; i < totalVehicles.length; i++) {
					System.out.print("\n" + totalVehicles[i].getPlate());
				}
				System.out.println();
				Scanner input = new Scanner(System.in);
				String selectedVehicle = input.nextLine();
				for (int i = 0; i < totalVehicles.length; i++) {
					if (selectedVehicle.equals(totalVehicles[i].getPlate())) {
						System.out.println("How much mph do you want to increase the vehicle by?");
						totalVehicles[i].increaseSpeed(input.nextInt());
						vehicleFound = true;
					}
				}
				if (vehicleFound == false) {
					System.out.println("License Plate not found!!!");
				}
			} else if (num == 6) {
				Boolean vehicleFound = false;
				System.out.print("Type which vehicle you want to decrease the speed of: ");
				for (int i = 0; i < totalVehicles.length; i++) {
					System.out.print("\n" + totalVehicles[i].getPlate());
				}
				System.out.println();
				Scanner input = new Scanner(System.in);
				String selectedVehicle = input.nextLine();
				for (int i = 0; i < totalVehicles.length; i++) {
					if (selectedVehicle.equals(totalVehicles[i].getPlate())) {
						System.out.println("How much mph do you want to decrease the vehicle by?");
						totalVehicles[i].decreaseSpeed(input.nextInt());
						vehicleFound = true;
					}
				}
				if (vehicleFound == false) {
					System.out.println("License Plate not found!!!");
				}
			} else if (num == 7) {
				Boolean vehicleFound = false;
				System.out.print("Type which vehicle you want to get the speed of: ");
				for (int i = 0; i < totalVehicles.length; i++) {
					System.out.print("\n" + totalVehicles[i].getPlate());
				}
				System.out.println();
				Scanner input = new Scanner(System.in);
				String selectedVehicle = input.nextLine();
				for (int i = 0; i < totalVehicles.length; i++) {
					if (selectedVehicle.equals(totalVehicles[i].getPlate())) {
						totalVehicles[i].getSpeed();
						vehicleFound = true;
					}
				}
				if (vehicleFound == false) {
					System.out.println("License Plate not found!!!");
				}
			} else if (num == 8) {
				Boolean vehicleFound = false;
				System.out.print("Type which vehicle you want to get the gas mileage of: ");
				for (int i = 0; i < totalVehicles.length; i++) {
					System.out.print("\n" + totalVehicles[i].getPlate());
				}
				System.out.println();
				Scanner input = new Scanner(System.in);
				String selectedVehicle = input.nextLine();
				for (int i = 0; i < totalVehicles.length; i++) {
					if (selectedVehicle.equals(totalVehicles[i].getPlate())) {
						totalVehicles[i].getGasMileage();
						vehicleFound = true;
					}
				}
				if (vehicleFound == false) {
					System.out.println("License Plate not found!!!");
				}
			} else if (num == 9) {
				Boolean vehicleFound = false;
				System.out.print("Type which vehicle you want to get the weight of: ");
				for (int i = 0; i < totalVehicles.length; i++) {
					System.out.print("\n" + totalVehicles[i].getPlate());
				}
				System.out.println();
				Scanner input = new Scanner(System.in);
				String selectedVehicle = input.nextLine();
				for (int i = 0; i < totalVehicles.length; i++) {
					if (selectedVehicle.equals(totalVehicles[i].getPlate())) {
						totalVehicles[i].getWeight();
						vehicleFound = true;
					}
				}
				if (vehicleFound == false) {
					System.out.println("License Plate not found!!!");
				}
			} else if (num == 10) {
				Boolean vehicleFound = false;
				System.out.print("Type which vehicle you want to open the trunk/tailgate of: ");
				for (int i = 0; i < totalVehicles.length; i++) {
					System.out.print("\n" + totalVehicles[i].getPlate());
				}
				System.out.println();
				Scanner input = new Scanner(System.in);
				String selectedVehicle = input.nextLine();
				for (int i = 0; i < totalVehicles.length; i++) {
					if (selectedVehicle.equals(totalVehicles[i].getPlate())) {
						totalVehicles[i].open();
						vehicleFound = true;
					}
				}
				if (vehicleFound == false) {
					System.out.println("License Plate not found!!!");
				}
			} else if (num == 11) {
				Boolean vehicleFound = false;
				System.out.print("Type which vehicle you want to close the trunk/tailgate of: ");
				for (int i = 0; i < totalVehicles.length; i++) {
					System.out.print("\n" + totalVehicles[i].getPlate());
				}
				System.out.println();
				Scanner input = new Scanner(System.in);
				String selectedVehicle = input.nextLine();
				for (int i = 0; i < totalVehicles.length; i++) {
					if (selectedVehicle.equals(totalVehicles[i].getPlate())) {
						totalVehicles[i].close();
						vehicleFound = true;
					}
				}
				if (vehicleFound == false) {
					System.out.println("License Plate not found!!!");
				}
			} else if (num == 12) {
				System.out.println("Number of Vehicles: " +Vehicle.numOfVehicles);
			}

		}
	}
}
