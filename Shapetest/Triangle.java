package Shapetest;

public class Triangle implements ShapeInterface {
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double area() {
		double s = 0.5 * (a + b + c);
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	public double perimeter() {
		return a+b+c;
	} 
	
	
}
