package Unit_2;
import java.util.*;
public class Exercise_16 {
	public static void main(String[] args) {
		
		int numCount = 0;
		float sumOfNum = 0;
		int x = 0;
		while(x>=0) {
			
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			x = Integer.parseInt(input);
			numCount++;
			sumOfNum += Integer.parseInt(input);
		}
		sumOfNum /= 100;
		System.out.println("Sum of Integers: " + sumOfNum + " Amount of Numbers: " + numCount);
	}
}
