package Unit_1;

import java.util.Scanner;

public class Exercise_12 {
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		 System.out.println("Enter a Number:");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		System.out.println(encrypt(str, num));
		
	}
	
	public static StringBuffer encrypt(String str, int num) { 
        StringBuffer output= new StringBuffer(); 
  
        for (int i=0; i<str.length(); i++) { 
            if (Character.isUpperCase(str.charAt(i))) { 
                char ch = (char)(((int)str.charAt(i) + 
                                  num - 65) % 26 + 65); 
                output.append(ch); 
            } else { 
                char ch = (char)(((int)str.charAt(i) + num - 97) % 26 + 97); 
                output.append(ch); 
            } 
        } 
        return output; 
    } 
}
