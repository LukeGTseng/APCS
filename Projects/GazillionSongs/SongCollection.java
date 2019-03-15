package GazillionSongs;

import java.util.*;

public class SongCollection {
	private ArrayList<Song> songs = new ArrayList<>();

	public SongCollection(ArrayList<Song> songs) {
		this.songs = songs;
	}
	public void filterYear(Range r) {
		for (int i = 0; i < songs.size(); i++) {
			if (r.contains(songs.get(i).getYear()) == false) {
				songs.remove(i);
			}
		}
	}
	public void filterRank(Range r) {
		for (int i = 0; i < songs.size(); i++) {
			if (r.contains(songs.get(i).getYear()) == false) {
				songs.remove(i);
			}
		}
	}
	public void filterArtist(String s) {
		for (int i = 0; i < songs.size(); i++) {
			if (!songs.get(i).getArtist().contains(s)) {
				songs.remove(i);
			}
		}
	}
	public void filterTitle(String s) {
		for (int i = 0; i < songs.size(); i++) {
			if (!songs.get(i).getTitle().contains(s)) {
				songs.remove(i);
			}
		}
	}
	public void sortYear() {
		int[] year = new int[songs.size()];
		for(int i = 0;i < year.length;i++) {
			year[i] = songs.get(i).getYear();
		}
	}
	public void sortRank() {
		int[] rank = new int[songs.size()];
		for(int i = 0;i < rank.length;i++) {
			rank[i] = songs.get(i).getRank();
		}
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
			if (L[i].compareTo(R[j]) <= 0) {
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
