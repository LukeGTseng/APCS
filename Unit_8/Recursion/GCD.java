package Recursion;
import java.util.*;

public class GCD {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2= s.nextInt();
		System.out.println(findGCD(num1,num2));
	}
	
	public static int findGCD(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
		return findGCD(num2, num1 % num2);
	}
	
}
