package Unit_7;

import java.util.*;
import java.io.*;

public class Exercise_3 {
	public static void main(String[] args) throws FileNotFoundException {
		int[] arr = new int[20];
		File search = new File("C:\\Users\\s-tsengl\\Documents\\github-get-started-LukeGTseng-master\\HelloGithub\\src\\Unit_7\\numbers.txt");
		Scanner s = new Scanner(search);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(selectionSort(arr)));
	}

	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
