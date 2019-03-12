package Unit_7;

import java.util.*;
import java.io.*;

public class Exercise_3Names {
	public static void main(String[] args) throws FileNotFoundException {
		String[] arr = new String[20];
		File search = new File("C:\\Users\\s-tsengl\\Documents\\github-get-started-LukeGTseng-master\\HelloGithub\\src\\Unit_7\\names.txt");
		Scanner s = new Scanner(search);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextLine();
		}
		if(input.equals("ascending")) {
			System.out.println(Arrays.toString(selectionSort(arr)));
		} else if(input.equals("descending")) {
			System.out.println(Arrays.toString(xd(arr)));
		}
	}

	public static String[] selectionSort(String[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}
			}
			String temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	public static String[] xd(String[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[min]) > 0) {
					min = j;
				}
			}
			String temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
