package Unit_3;
import java.io.*;
import java.util.Scanner;
public class Exercise_2 {
	public static void main(String[] args) throws FileNotFoundException{
			File myFile = new File("C:\\Users\\s-tsengl\\eclipse-workspace\\Chap6Ex13.txt");
			Scanner s = new Scanner(myFile);
			while(s.hasNextLine()) {
				String line = s.nextLine();
					if(line.indexOf("/*")>=0) {
						while(line.indexOf("*/")<0)
							line = s.nextLine();
					} else if(line.indexOf("//")>=0)
						System.out.println(line.substring(0,line.indexOf("//")));
						else 
						System.out.println(line);
			}
	}
}
