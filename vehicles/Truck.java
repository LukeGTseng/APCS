package vehicles;

public class Truck extends Vehicle {
	static int increment = 2;

	public Truck() {
		super("T" + increment);
		increment += 2;
	}

	public static Truck readFromInput() {
		Truck newTruck = new Truck();
		numOfVehicles++;
		return newTruck;
	}

	void open() {
		System.out.println("Tailgate Open");
	}

	void close() {
		System.out.println("Tailgate Closed");
	}

	public void setSpeed(int speed) {
		if (speed <= 75) {
			System.out.println("Speed set to " + speed);
			this.speed = speed;
		} else {
			System.out.println("Speed cannot go over 75. Speed will be set at 75 mph.");
			this.speed = 75;
		}
	}

	public void increaseSpeed(int speed) {
		if (speed + this.speed <= 75) {
			this.speed += speed;
			System.out.println("Speed now at " + this.speed);
		} else {
			System.out.println("Speed cannot go over 75. Speed is now at 75 mph.");
			this.speed = 75;
		}
	}

	void getSpeed() {
		System.out.println("Speed is at " + speed);
	}

	void getGasMileage() {
		System.out.println("The gas mileage is 20 miles per gallon");
	}

	void getWeight() {
		System.out.println("Weighs 3500 pounds.");
		
	}

}
