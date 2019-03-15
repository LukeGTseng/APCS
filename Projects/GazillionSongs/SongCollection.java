package GazillionSongs;

import java.util.*;
public class SongCollection {
	private ArrayList<Song> songs = new ArrayList<>();
	
	public SongCollection(ArrayList<Song> songs) {
		
	}
	public void filterYear(Range r) {
		if()
	}
	public void filterRank(Range r) {
		
	}
	public void filterArtist(String s) {
		
	}
	public void filterTitle(String s) {
		
	}
	public void sortYear() {
		
	}
	public void sortRank() {
		
	}
	public void sortArtist() {
		
	}
	public void sortTitle() {
		
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
