package Unit_1;

public class Exercise_8 {
	public static void top() {
		System.out.println("  ______  ");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}
	public static void bottom() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
	}
	public static void line() {
		System.out.println("+--------+");
	}
	public static void stop() {
		top();
		System.out.println("|  STOP  |");
		bottom();
	}
	public static void hexagon() {
		top();
		bottom();
	}
	public static void space() {
		System.out.println("");
	}
	
	public static void main(String[] args) {
		hexagon();
		space();
		bottom();
		line();
		top();
		space();
		stop();
		space();
		top();
		line();
	}
}
