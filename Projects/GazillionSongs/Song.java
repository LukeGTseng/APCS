package GazillionSongs;

import java.util.*;
public class Song {
	private String year;
	private String rank;
	private String artist;
	private String title;
	
	public static Song parse(String s) {
		Scanner scn = new Scanner(s).useDelimiter("\t");
		Song song = new Song();
		song.year = scn.next();
		song.rank = scn.next();
		song.artist = scn.next();
		song.title = scn.next();
		return song;
	}
	public String getYear() {
		return year;
	}
	public String rank() {
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
