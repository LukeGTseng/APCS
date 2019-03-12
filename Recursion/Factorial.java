package Recursion;
import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(factorial(num));
	}
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return n* factorial(n-1);
		}
	}

}
