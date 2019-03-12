package Unit_3;
import java.io.*;
import java.util.Scanner;
public class Exercise_1 {
	public static void main(String[] args) {
		File myFile = new File("C:\\Users\\s-tsengl\\eclipse-workspace\\Chap6Ex2.txt");
		int totalNums = 0;
		int sumOfNums = 0;
		int evenCount = 0;
		try {
			Scanner s = new Scanner(myFile);
			while(s.hasNextInt()) {
				int nextNum = s.nextInt();
				totalNums++;
				sumOfNums += nextNum;
				if(evenNumbers(nextNum)) {
					evenCount++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Total numbers: " + totalNums);
		System.out.println("Sum of numbers: " + sumOfNums);
		System.out.println("Count of even numbers: " + evenCount);
		double dcount = evenCount;
		double dtotal = totalNums;
		double percentage = (dcount/dtotal)*100;
		System.out.println("Percentage of even numbers: " + percentage + "%");
	}
	public static boolean evenNumbers(int a) {
		if(a%2==0) {
			return true;
		} else {
			return false;
		}
	}
}
