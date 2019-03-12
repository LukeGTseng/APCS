package Shapetest;

public class ShapeTesting {
	public static void main(String[] args) {
		
		ShapeInterface r = new Rectangle(10,13);
		ShapeInterface c = new Circle(5);
		ShapeInterface t = new Triangle(3,4,5);
		System.out.println("Rectangle area: " + r.area());
		System.out.println("Rectangle perimeter: " + r.perimeter());
		System.out.println("Triangle area: " + t.area());
		System.out.println("Triangle perimeter: " + t.perimeter());
		System.out.println("Circle area: " + c.area());
		System.out.println("Circle perimeter: " + c.perimeter());
	}
}
