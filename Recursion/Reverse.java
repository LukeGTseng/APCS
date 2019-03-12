package Recursion;
import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String rev = reverse(str);
		System.out.println(rev);
		if(check(str,0,str.length()-1) == true) {
			System.out.println("Your input is a palindrome");
		} else {
			System.out.println("Your input is not a palindrome");
		}
	}
	
	public static String reverse(String str) {
		if(str.length()<=1 || str== null) {
			return str;
		} else {
			return reverse(str.substring(1)) + str.charAt(0);
		}
	}
	
	public static boolean check(String str, int start, int end) {
		if(start == end) {
			return true;
		}
		if (str.charAt(start) != str.charAt(end)) {
			return false;
		}
		if (start< end){
			return check(str, start+1, end- 1);
		}
		return true;	
	}
}
