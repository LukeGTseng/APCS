package Unit_3;
import java.util.Arrays;
public class Exercise_5 {
	public static void main(String[] args) {
		int[] list1 = {123,12,123,123,122,11,212,212,212,2,12,121,2,12,121,21,2};
		int[] list2 = {4,12,5,61,324,323,123,1,13,213,123,123,213,21,321,3,21321,213,21,321,321,3,213,213,213,1};
			System.out.println(Arrays.toString(append(list1,list2)));
	}
	public static int[] append(int[] a, int[] b) {
		int length = a.length+b.length;
		int[] c = new int[length];
		for(int i = 0; i < a.length;i++) {
			c[i] = a[i];
		}
		for(int i = a.length; i < length;i++) {
			c[i] = b[i-a.length];
		}
		return c;
	}
	
}
