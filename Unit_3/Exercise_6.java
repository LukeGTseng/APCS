package Unit_3;
import java.util.Arrays;
public class Exercise_6 {
	public static void main(String[] args) {
		int[][] a = {{36,12, 25,19},{12,65,311,32},{42,25,1,32}};
		int[][] b = {{3246,123, 125,9},{42,25,1,32},{12,53,78,23}};
		System.out.println(Arrays.deepToString(matrixAdd(a,b)));
	}
	public static int[][] matrixAdd(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];
		for(int i = 0; i < c.length; i++) {
			for(int j = 0;j < c[i].length;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}
