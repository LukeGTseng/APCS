package GazillionSongs;

import java.util.*;
public class Song {
	// fields
	private int year;
	private int rank;
	private String artist;
	private String title;
	// methods
	public static Song parse(String s) {
		Scanner scn = new Scanner(s).useDelimiter("\t"); // everything is formatted using tabs in between
		Song song = new Song();
		song.year = scn.nextInt();
		song.rank = scn.nextInt();
		song.artist = scn.next();
		song.title = scn.next();
		return song; // returns song object
	}
	public int getYear() { // returns year
		return year;
	}
	public int getRank() { // returns rank
		return rank;
	}
	public String getArtist() { // returns artist
		return artist;
	}
	public String getTitle() { // returns title
		return title;
	}
	public String toString() {
		return year + "\t" + rank + "\t" + artist + "\t" + title; // prints using this format 
	}
}
