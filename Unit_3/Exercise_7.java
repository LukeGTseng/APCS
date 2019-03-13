package Unit_3;
import java.util.*;
public class Exercise_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		System.out.println("How many times do you want to roll?");
		int times = s.nextInt();
		int[] a = new int[times];
		for(int i = 1;i<=times;i++) {
			a[i-1] = random();
		}
		System.out.println(Arrays.toString(a));
		for(int i = 0;i<a.length;i++) {
			if(a[i] == 1) {
				one++;
			} else if(a[i] == 2) {
				two++;
			} else if(a[i] == 3) {
				three++;
			} else if(a[i] == 4) {
				four++;
			} else if(a[i] == 5) {
				five++;
			} else if(a[i] == 6) {
				six++;
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
		int randNum = rand.nextInt(6)+1;
		return randNum;
	}
}
