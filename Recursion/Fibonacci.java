package Recursion;
import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i = num; i > 0;i--) {
			System.out.println(fib(i));
		}
	}
	public static int fib(int n) {
		if(n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
}
