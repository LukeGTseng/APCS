package mergeSort;

import java.io.*;
import java.util.*;

public class mergeSort {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer> intList = new ArrayList<Integer> ();
		File search = new File("C:\\Users\\s-tsengl\\Documents\\github-get-started-LukeGTseng-master\\HelloGithub\\src\\Unit_7\\numbers.txt");
		Scanner s = new Scanner(search);
		while(s.hasNextInt()) {
			intList.add(s.nextInt());
		}
		int[] intArr = new int[intList.size()];
		for(int i = 0; i< intList.size();i++) {
			intArr[i] = intList.get(i);
		}
		sortNum(intArr,0,intArr.length-1);
		System.out.println(Arrays.toString(intArr));
		
		ArrayList<String> strList = new ArrayList<String> ();
		File newFile = new File("C:\\Users\\s-tsengl\\Documents\\github-get-started-LukeGTseng-master\\HelloGithub\\src\\Unit_7\\names.txt");
		Scanner scn = new Scanner(newFile);
		while(scn.hasNextLine()) {
			strList.add(scn.nextLine());
		}
		String[] strArr = new String[strList.size()];
		for(int i = 0; i< strList.size();i++) {
			strArr[i] = strList.get(i);
		}
		sortStr(strArr,0,strArr.length-1);
		System.out.println(Arrays.toString(strArr));
	}
	
	public static void mergeNum(int arr[], int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[middle + 1 + j];
		}
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void sortNum(int arr[], int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			sortNum(arr, left, middle);
			sortNum(arr, middle + 1, right);
			mergeNum(arr, left, middle, right);
		}
	}
	public static void mergeStr(String arr[], int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;
		String L[] = new String[n1];
		String R[] = new String[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[middle + 1 + j];
		}
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i].compareTo(R[j])<=0) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void sortStr(String arr[], int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			sortStr(arr, left, middle);
			sortStr(arr, middle + 1, right);
			mergeStr(arr, left, middle, right);
		}
	}
}
