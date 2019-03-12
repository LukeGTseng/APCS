package Unit_2;
import java.util.Scanner;
public class Exercise_14 {
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str);
			while(true) {
				
				Scanner np = new Scanner(System.in);
				char input = np.next().charAt(0);
				if(input == 'n') {
					System.out.println(encrypt(str));
					str = encrypt(str);
				} else if (input == 'p') {
					System.out.println(decrypt(str));
					str = decrypt(str);
				} else {
					break;
				}
			}
	}
	
	public static String encrypt(String str) { 
		String output = "";
        for (int i=0; i<str.length(); i++) { 
            if (Character.isUpperCase(str.charAt(i))) { 
                char ch = (char)(((int)str.charAt(i) - 64) % 26 + 65); 
                output += ch; 
            } else { 
                char ch = (char)(((int)str.charAt(i) - 96) % 26 + 97); 
                output += ch; 
            } 
        } 
        return output; 
    } 
	public static String decrypt(String str) { 
		String output = "";
        for (int i=0; i<str.length(); i++) { 
            if (Character.isUpperCase(str.charAt(i))) { 
                char ch = (char)(((int)str.charAt(i) - 91) % 26 + 90); 
                output += ch; 
            } else { 
                char ch = (char)(((int)str.charAt(i) - 123) % 26 + 122); 
                output += ch; 
            } 
        
        }
		return output;
	}
}
