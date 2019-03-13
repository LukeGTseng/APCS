package vehicles;

public class Car extends Vehicle {
	static int increment = 1;

	public Car() {
		super("C" + increment);
		increment += 2;
	}

	public static Car readFromInput() {
		Car newCar = new Car();
		numOfVehicles++;
		return newCar;
	}

	void open() {
		System.out.println("Trunk Open");
	}

	void close() {
		System.out.println("Trunk Closed");
	}

	void getSpeed() {
		System.out.println("Speed is at " + speed);
	}

	void getGasMileage() {
		System.out.println("The gas mileage is 25 miles per gallon");
	}

	void getWeight() {
		System.out.println("Weighs 2000 pounds.");
		
	}
}
