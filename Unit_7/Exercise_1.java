package Unit_7;

import java.io.*;
import java.util.*;

public class Exercise_1 {
	public static void main(String[] args) throws FileNotFoundException {
		int nine = 0;
		int seven = 0;
		int fortyfive = 0;
		File search = new File("C:\\Users\\s-tsengl\\Documents\\GitHub\\github-get-started-LukeGTseng\\HelloGithub\\src\\SeqSearch.txt");
		Scanner s = new Scanner(search);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(s.hasNext()) {
			list.add(s.nextInt());
		}
		for(int i : list) {
			if(i == 9) {
				nine++;
			} else if (i == 7) {
				seven++;
			} else if (i ==45) {
				fortyfive++;
			}
		}
		System.out.println("Sevens:" + seven);
		System.out.println("Nines:" + nine);
		System.out.println("Forty-Fives:" + fortyfive);
	}
}
