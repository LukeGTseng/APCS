package Unit_1;

public class Exercise_14 {
	public static void main(String[] args) {
		double chicken = 15.99;
		double milk = 5.99;
		double cow = 20.99;
		double rice = 14;
		double pork = 18.50;
		System.out.print("The total cost is " + totalCart(chicken,milk,cow,rice,pork));
	}
	public static double totalCart(double a, double b, double c, double d, double e) {
		double output = a + b + c + d + e;
		output /= 10;
		output += 7.95;
		output -= output% 0.01;
		return output;
	}
}
