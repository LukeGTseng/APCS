package Unit_2;
import java.util.Scanner;
public class Exercise_11 {
	public static void main(String[] args) {
		
		int numCount = 0;
		int sumOfNum = 0;
		int x= 0;
		while(x>=0) {
			
			Scanner s = new Scanner(System.in);
			x = s.nextInt();
			numCount++; 
			sumOfNum += x;
		}
		System.out.println("Sum of Integers: " + sumOfNum + " Amount of Numbers: " + numCount);
	}
}
