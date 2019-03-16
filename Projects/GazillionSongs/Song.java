package GazillionSongs;

import java.util.*;
public class Song {
	private int year;
	private int rank;
	private String artist;
	private String title;
	
	public static Song parse(String s) {
		Scanner scn = new Scanner(s).useDelimiter("\t");
		Song song = new Song();
		song.year = scn.nextInt();
		song.rank = scn.nextInt();
		song.artist = scn.next();
		song.title = scn.next();
		return song;
	}
	public int getYear() {
		return year;
	}
	public int getRank() {
		return rank;
	}
	public String getArtist() {
		return artist;
	}
	public String getTitle() {
		return title;
	}
	public String toString() {
		return year + "\t" + rank + "\t" + artist + "\t" + title;
	}
}
