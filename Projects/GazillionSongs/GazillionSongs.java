package GazillionSongs;

import java.io.*;
import java.util.*;

public class GazillionSongs {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Song> tempList = new ArrayList<Song>();
		SongCollection songs = new SongCollection(tempList);

		Scanner ipt = new Scanner(System.in);
		System.out.println("Which file would you like to input?"); // agazillionsongs.txt
		File iptFile = new File(ipt.nextLine());
		if (iptFile.exists() == false) {
			System.out.println("File does not exist");
			System.exit(1);
		}
		Scanner f = new Scanner(iptFile);
		System.out.println("Which file would you like to output to?");
		File optFile = new File(ipt.nextLine());
		PrintStream output = new PrintStream(optFile);
		while (f.hasNextLine()) {
			tempList.add(Song.parse(f.nextLine()));
		}
		// filtering
		boolean valid = false;
		do {
			System.out.println("Enter your Filter:\n-year<range>\t-rank<range>\t-artist<keyword>\t-title<keyword>");
			Scanner filterInput = new Scanner(System.in);
			String input = filterInput.nextLine();
			Scanner stringinput = new Scanner(input);
			while (stringinput.hasNext()) {
				String filter = stringinput.next();
				filter = filter.toLowerCase();
				if(filter.equals("")) {
					valid = true;
				} else if (filter.contains("<") == true || filter.contains(">") == true) {
					if (filter.contains("-year")) {
						filter = filter.substring(filter.indexOf("<") + 1, filter.indexOf(">"));
						songs.filterYear(Range.parse(filter));
						valid = true;
					} else if (filter.contains("-rank")) {
						filter = filter.substring(filter.indexOf("<") + 1, filter.indexOf(">"));
						songs.filterRank(Range.parse(filter));
						valid = true;
					} else if (filter.contains("-artist")) {
						filter = filter.substring(filter.indexOf("<") + 1, filter.indexOf(">"));
						songs.filterArtist(filter);
						valid = true;
					} else if (filter.contains("-title")) {
						filter = filter.substring(filter.indexOf("<") + 1, filter.indexOf(">"));
						songs.filterTitle(filter);
						valid = true;
					} else {
						System.out.println("Incorrect format");
					}
				} else {
					System.out.println("Incorrect format");
				}
			}
		} while (valid == false);
		// sorting
		valid = false;
		do {
			System.out.println(
					"Enter your sorting order:\n-sortBy<year>\t-sortBy<rank>\t-sortBy<artist>\t-sortBy<title>");
			Scanner sortInput = new Scanner(System.in);
			String sort = sortInput.nextLine();
			sort = sort.toLowerCase();
			if(sort.equals("")) {
				valid = true;
			} else if (sort.contains("<") == true || sort.contains(">") == true || sort.contains("-sortBy") == true) {
				sort = sort.substring(sort.indexOf("<") + 1, sort.indexOf(">"));
				if (sort.equals("year")) {
					songs.sortYear();
					valid = true;
				} else if (sort.equals("rank")) {
					songs.sortRank();
					valid = true;
				} else if (sort.equals("artist")) {
					songs.sortArtist();
					valid = true;
				} else if (sort.equals("title")) {
					songs.sortTitle();
					valid = true;
				} else {
					System.out.println("Incorrect format");
				}
			} else {
				System.out.println("Incorrect format");
			}
		} while (valid == false);
		songs.output(output);
	}
}
