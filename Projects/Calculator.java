import java.util.Scanner;
import java.lang.Math;

public class Calculator {
	private static Scanner s;

	public static void main(String[] args) {
		for(;;) {
		System.out.println("Enter your operator:");
        char choose;
    	s = new Scanner(System.in);
        choose = s.next().charAt(0);
        if(choose != '+' && choose !=  '-' && choose != '*' && choose != '/' && choose != '^' && choose != '|') { //check if the operation is legal
        	System.out.println("Illegal Operation.");
        }
        if(choose == '|') {
        	System.out.println("Enter a number:");
        	double num;
        	num = s.nextDouble();
        	if(num < 0) {
        		System.out.println(sqrt(num) + "i"); //add an i if we are square rooting a negative
        	} else {
        		System.out.println(sqrt(num));
        	}
        } else {
        	int num1,num2;
        	System.out.println("Enter first and second number:");
        	num1 = s.nextInt();
        	num2 = s.nextInt();
        	if(choose == '+') {
        		System.out.println(add(num1,num2));
        	} else if(choose == '-') {
        		System.out.println(sub(num1,num2));
        	} else if(choose == '*') {
        		System.out.println(mult(num1,num2));
        	} else if(choose == '/') {
        		System.out.println(div(num1,num2) + " with the remainder of " + rem(num1,num2));
        	} else if(choose == '^') {
        		System.out.println(pow(num1,num2));
        	}
       }
		}
}

	public static int add(int x, int y) { // method to add two numbers
		int result = x + y;
		return result;
	}

	public static int sub(int x, int y) { // method to subtract two numbers
		int result = x - y;
		return result;
	}

	public static int mult(int x, int y) { // method to multiply two numbers
		int result = x * y;
		return result;
	}

	public static int div(int x, int y) { // method to divide two numbers
		int result = x / y;
		return result;
	}

	public static int rem(int x, int y) { // method to find the remainder of the division
		int result = x % y;
		return result;
	}

	public static int pow(int x, int y) { // method to find the power of a number
		int result = x;
		if (y == 0) {
			return 0;
		} else {
			for (int i = 1; i < y; i++) {
				result *= x;
			}
			return result;
		}
	}

	public static double sqrt(double x) { // using a double and a math.sqrt function to find the square root
		double result;
		if (x < 0) {
			x = -x;
			result = Math.pow(x, 0.5);
		} else {
			result = Math.pow(x, 0.5);
		}
		return result;
	}
}
