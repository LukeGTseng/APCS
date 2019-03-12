package Unit_3;
import java.util.*;

public class Exercise_8 {
	public static void main(String[] args) {
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int sumOfNums = 0;
		int evenCount = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("How many times do you want to roll?");
		int times = s.nextInt();
		int[][] a = new int[2][times];
		for (int i = 1; i <= times; i++) {
			int firstRand = random();
			int secondRand = random();
			int currNum = firstRand + secondRand;
			sumOfNums += currNum;
			System.out.println(firstRand + " + " + secondRand + " = " + currNum);
			if (firstRand % 2 == 0) {
				evenCount++;
			}
			if (secondRand % 2 == 0) {
				evenCount++;
			}
			a[0][i - 1] = firstRand;
			a[1][i - 1] = secondRand;
		}
		System.out.println(Arrays.deepToString(a));
		System.out.println("Total numbers: " + times * 2);
		System.out.println("Sum of numbers: " + sumOfNums);
		System.out.println("Count of even numbers: " + evenCount);
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j][i] == 1) {
					one++;
				} else if (a[j][i] == 2) {
					two++;
				} else if (a[j][i] == 3) {
					three++;
				} else if (a[j][i] == 4) {
					four++;
				} else if (a[j][i] == 5) {
					five++;
				} else if (a[j][i] == 6) {
					six++;
				}
			}
		}
		System.out.println("Number of ones: " + one);
		System.out.println("Number of twos: " + two);
		System.out.println("Number of threes: " + three);
		System.out.println("Number of fours: " + four);
		System.out.println("Number of fives: " + five);
		System.out.println("Number of sixes: " + six);

	}

	public static int random() {
		Random rand = new Random();
		int randNum = rand.nextInt(6) + 1;
		return randNum;
	}
}
