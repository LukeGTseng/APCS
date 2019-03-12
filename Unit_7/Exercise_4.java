package Unit_7;

import java.util.*;
import java.io.*;

public class Exercise_4 {

	public static void main(String[] args) throws FileNotFoundException {
		File search = new File(
				"C:\\Users\\s-tsengl\\Documents\\github-get-started-LukeGTseng-master\\HelloGithub\\src\\Unit_7\\names.txt");
		Scanner s = new Scanner(search);
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNextLine()) {
			list.add(s.nextLine());
		}
		list.add("Sam");
		String[] xd = new String[list.size()];
		xd = list.toArray(xd);
		String[] empty = new String[0];
		String[] one = new String[1];
		String[] same = {"Sam", "Sam", "Sam"};
		if (checkValid(xd) == true) {
			insertionSort(xd);
			System.out.println(Arrays.toString(xd));
		}
		if (checkValid(empty) == true) {
			insertionSort(empty);
			System.out.println(Arrays.toString(empty));
		}
		if (checkValid(one) == true) {
			insertionSort(one);
			System.out.println(Arrays.toString(one));
		}
		if (checkValid(same) == true) {
			insertionSort(same);
			System.out.println(Arrays.toString(same));
		}
	}

	public static void insertionSort(String[] xd) {
		for (int i = 1; i < xd.length; i++) {
			for (int j = i; j > 0 && xd[j].compareTo(xd[j - 1]) < 0; j--) {
				String temp = xd[j];
				xd[j] = xd[j - 1];
				xd[j - 1] = temp;
			}
		}
	}

	public static boolean checkValid(String[] xd) {
		if (xd.length == 0) {
			System.out.println("Array is empty");
			return false;
		} else if (xd.length == 1) {
			System.out.println("There is only 1 element in the array");
			return false;
		} else if (check(xd) == true) {
			System.out.println("All elements are the same");
			return false;
		} else {
			return true;
		}
	}

	public static boolean check(String[] xd) {
		for (int i = 1; i < xd.length; i++) {
			if (!xd[i - 1].equals(xd[i])) {
				return false;
			}
		}
		return true;
	}

	public static void reverse(String[] xd) {
		if (xd.length == 0) {
			System.out.println("xd is empty");
		} else if (xd.length == 1) {

			System.out.println("There is only 1 element in the xd");
		} else if (check(xd) == true) {
			System.out.println("All elements are the same");
		} else {
			for (int i = 1; i < xd.length; i++) {
				for (int j = i; j > 0 && xd[j].compareTo(xd[j - 1]) > 0; j--) {
					String temp = xd[j];
					xd[j] = xd[j - 1];
					xd[j - 1] = temp;
				}
			}
		}
	}

}
