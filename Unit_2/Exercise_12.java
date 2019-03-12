package Unit_2;
import java.util.*;
public class Exercise_12 { 
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		String input = i.nextLine();
		Scanner s = new Scanner(input).useDelimiter(",");
		while(s.hasNext()) {
			System.out.println(s.next());
		}
	}
}
