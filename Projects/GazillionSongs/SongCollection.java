package GazillionSongs;

import java.io.*;
import java.util.*;

public class SongCollection {
	private static ArrayList<Song> songs = new ArrayList<>();
	public SongCollection(ArrayList<Song> songs) {
		this.songs = songs;
	}
	public void filterYear(Range r) {
		for (int i = 0; i < songs.size(); i++) {
			if (r.contains(songs.get(i).getYear()) == false) {
				songs.remove(i);
				i--;
			}
		}
	}
	public void filterRank(Range r) {
		for (int i = 0; i < songs.size(); i++) {
			if (r.contains(songs.get(i).getRank()) == false) {
				songs.remove(i);
				i--;
			}
		}
	}
	public void filterArtist(String s) {
		for (int i = 0; i < songs.size(); i++) {
			if (!songs.get(i).getArtist().toLowerCase().contains(s)) {
				songs.remove(i);
				i--;
			}
		}
	}
	public void filterTitle(String s) {
		for (int i = 0; i < songs.size(); i++) {
			if (!songs.get(i).getTitle().contains(s)) {
				songs.remove(i);
				i--;
			}
		}
	}
	public void sortYear() {
		selectionSortYear();
	}
	public void sortRank() {
		selectionSortRank();
	}
	public void sortArtist() {
		selectionSortArtist();
	}
	public void sortTitle() {
		selectionSortTitle();
	}

	public static void selectionSortYear() {
		for (int i = 0; i < songs.size(); i++) {
			int min = i;
			for (int j = i + 1; j < songs.size(); j++) {
				if (songs.get(j).getYear() < songs.get(min).getYear()) {
					min = j;
				}
			}
			Song temp = songs.get(i);
			songs.set(i, songs.get(min));
			songs.set(min, temp);
		}
	}
	public static void selectionSortRank() {
		for (int i = 0; i < songs.size(); i++) {
			int min = i;
			for (int j = i + 1; j < songs.size(); j++) {
				if (songs.get(j).getRank() < songs.get(min).getRank()) {
					min = j;
				}
			}
			Song temp = songs.get(i);
			songs.set(i, songs.get(min));
			songs.set(min, temp);
		}
	}
	public static void selectionSortArtist() {
		for (int i = 0; i < songs.size(); i++) {
			int min = i;
			for (int j = i + 1; j < songs.size(); j++) {
				if (songs.get(j).getArtist().compareTo(songs.get(min).getArtist())<0) {
					min = j;
				}
			}
			Song temp = songs.get(i);
			songs.set(i, songs.get(min));
			songs.set(min, temp);
		}
	}
	public static void selectionSortTitle() {
		for (int i = 0; i < songs.size(); i++) {
			int min = i;
			for (int j = i + 1; j < songs.size(); j++) {
				if (songs.get(j).getTitle().compareTo(songs.get(min).getTitle())<0) {
					min = j;
				}
			}
			Song temp = songs.get(i);
			songs.set(i, songs.get(min));
			songs.set(min, temp);
		}
	}
	public void output(PrintStream out) {
		for (Song s : songs) {
			out.println(s.toString());
		}
	}
}
