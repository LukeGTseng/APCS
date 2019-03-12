package Unit_7;

import java.io.*;
import java.util.*;

public class Exercise_2 {
	public static void main(String[] args) throws FileNotFoundException {
		File search = new File(
				"C:\\Users\\s-tsengl\\Documents\\github-get-started-LukeGTseng-master\\HelloGithub\\src\\Unit_7\\numsearch.txt");
		Scanner s = new Scanner(search);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (s.hasNext()) {
			list.add(s.nextInt());
		}
		System.out.println("Five: " + binarySearch(list,5));
		System.out.println("Nine: " + binarySearch(list,9));
		System.out.println("Forty-Three: " + binarySearch(list,43));
		System.out.println("Seventy-Nine: " + binarySearch(list,79));
	}

	public static int binarySearch(ArrayList<Integer> list, int target) {
	    int min = 0;
	    int max = list.size() - 1;
	    
	    while (min <= max) {
	        int mid = (min + max) / 2;
	        if (list.get(mid) < target) {
	            min = mid + 1;  
	        } else if (list.get(mid) > target) {
	            max = mid - 1;
	        } else {
	            return mid;
	        }
	    }
	   return -(min + 1);
	}

}
