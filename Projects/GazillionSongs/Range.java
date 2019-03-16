package GazillionSongs;

import java.util.Scanner;

public class Range {
	private int max;
	private int min;
	public static Range parse(String s) {
		Range Range = new Range();
		Scanner scn = new Scanner(s).useDelimiter("-");
		Range.min = scn.nextInt();
		if(scn.hasNextInt()) {
			Range.max = scn.nextInt();
		} else {
			Range.max = Range.min;
		}
		return Range;
	}
	public boolean contains(int n) {
		if(n >= min && n <= max) {
			return true;
		} else {
			return false;
		}
	}
	public int getMax() {
		return max;
	}
	public int getMin() {
		return min;
	}
}