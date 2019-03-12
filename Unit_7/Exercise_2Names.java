package Unit_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_2Names {
	public static void main(String[] args) throws FileNotFoundException {
		File search = new File(
				"C:\\Users\\s-tsengl\\Documents\\github-get-started-LukeGTseng-master\\HelloGithub\\src\\Unit_7\\namesearch.txt");
		Scanner s = new Scanner(search);
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNextLine()) {
			list.add(s.nextLine());
		}
		System.out.println("Dennis: " + nameBinarySearch(list, "Dennis"));
		System.out.println("Billy-Bob: " + nameBinarySearch(list, "Billy-Bob"));
		System.out.println("Steve: " + nameBinarySearch(list, "Steve"));
	}

	public static int nameBinarySearch(ArrayList<String> list, String target) {
		int min = 0;
		int max = list.size() - 1;

		while (min < max) {
			int mid = (min + max) / 2;
			if (target.compareTo(list.get(mid))>0) {
				min = mid + 1;
			} else if (target.compareTo(list.get(mid))<0) {
				max = mid - 1;
			} else {
				return mid;
			}
		}
		return -(min + 1);
	}
}
