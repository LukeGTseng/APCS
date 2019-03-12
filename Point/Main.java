package Point;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type in the first coordinate point: ");
		Point a = new Point(s.nextInt(),s.nextInt());
		System.out.println("Type in the second coordinate point: ");
		Point b = new Point(s.nextInt(),s.nextInt());
		System.out.println("Distance: " + Point.distance(a,b)); //distance
		Point.slopeTo(a,b); //slope
		Point.midpointTo(a,b); //midpoint
	}
}
