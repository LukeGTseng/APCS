package vehicles;
import java.util.*;

abstract class Vehicle {
	int speed;
	static int numOfVehicles = 0;
	Scanner s = new Scanner(System.in);
	String licensePlate;
	static ArrayList<String> list = new ArrayList<String>();
	private static String[] allPlates;

	abstract void getSpeed();

	abstract void getGasMileage();

	abstract void getWeight();

	abstract void open();
	
	abstract void close();
	
	public Vehicle(String licensePlate) {
		this.licensePlate = licensePlate;
		list.add(licensePlate);
		allPlates = list.toArray(new String[list.size()]);
		System.out.println(licensePlate);
	}

	public void start() {
		System.out.println("Starting vehicle");
		System.out.println("Set the speed of the vehicle");
		setSpeed(s.nextInt());
	}

	public void stop() {
		this.speed = 0;
		System.out.println("Stopping vehicle");
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("Speed set to " + this.speed + " mph");
	}

	public void turn() {
		String input;
		System.out.println("Turn Left(L) or Right(R)?");
		input = s.next();
		if (input.equals("L")) {
			System.out.println("Turning Left");
		} else if (input.equals("R")) {
			System.out.println("Turning Right");
		}
	}

	public void increaseSpeed(int speed) {
		this.speed += speed;
		System.out.printf("Speed now at %d mph\n", speed);
	}

	public void decreaseSpeed(int speed) {
		if (this.speed - speed < 0) {
			this.speed = 0;
		} else {
			this.speed -= speed;
			System.out.printf("Speed now at %d mph\n", this.speed);
		}
	}

	public static int getNumOfVehicles() {
		return numOfVehicles;
	}

	public String getPlate() {
		return licensePlate;
	}
}
