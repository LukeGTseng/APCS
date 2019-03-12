package Point;

public class Point {
	private int x;
	private int y;
	private double radius;
	private double theta;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.printf("Coordinates: %s\n", getCoord());
		System.out.printf("Polar Coordinate: %s\n", polarCoord());
	}
	public String polarCoord() {
		return String.format("(%.5f, %.5f)", getRadius(getX(), getY()), getTheta(getY(), getX()));
	}
	public double getRadius(int x, int y) {
		radius = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
		return radius;
	}
	public double getTheta(int y, int x) {
		theta = Math.atan2(y,x);
		return theta;
	}
	public static void slopeTo(Point moo, Point dab) {
		System.out.println("Slope: " + (dab.y-moo.y) + "/" + (dab.x-moo.x));
	}
	public static void midpointTo(Point moo, Point dab) {
		double x = (moo.x + dab.x)/2;
		double y = (moo.y + dab.y)/2;
		System.out.printf("Midpoint: (" + x + ", " + y + ")");
	}
	public static double distance(Point moo, Point dab) { //formula: square root of (x2-x1) squared + (y2-y1) squared;
		double distance = Math.sqrt(Math.pow(moo.x-dab.x,2)+ Math.pow(moo.y-dab.y,2));
		return distance;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String getCoord() {
		return String.format("(%d, %d)", x, y);
	}
}
