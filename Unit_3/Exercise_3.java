package Unit_3;

import java.io.*;
import java.util.Scanner;

public class Exercise_3.java {
	public static void main(String[] args) {
		try {
			File myFile = new File("C:\\Users\\s-tsengl\\eclipse-workspace\\Chap6Ex13.txt");
			Scanner s = new Scanner(myFile);
			PrintStream Output = new PrintStream(new File("StrippedComments.txt"));
			while (s.hasNextLine()) {
				String line = s.nextLine();
				if (line.indexOf("/*") >= 0) {
					line = s.nextLine();
					while (line.indexOf("*/") < 0) {
						line = s.nextLine();
					}
				} else if (line.indexOf("/") >= 0) {
					Output.println(line.substring(0, line.indexOf("/")));
				} else {
					Output.println(line);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
