package Unit_2;
import java.util.*;
public class Exercise_13 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		StringTokenizer str = new StringTokenizer(i.nextLine(),",");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
	}
}
