package GazillionSongs;

import java.io.File;
import java.util.Scanner;

public class GazillionSongs {
	public static void main(String[] args) {
		Scanner ipt = new Scanner(System.in);
		System.out.println("Which file would you like to input?");
		File iptFile = new File(ipt.nextLine());
		Scanner f = new Scanner(iptFile);
		System.out.println("Which file would you like to output to?");
		File optFile = new File(ipt.nextLine());
		
		while() {
			
		}
	}
}
