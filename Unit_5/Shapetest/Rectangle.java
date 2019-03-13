package Shapetest;

public class Rectangle implements ShapeInterface{
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	public double area() {
		return height*width;
	}

	public double perimeter() {
		return (width + height)*2;
	}

}
