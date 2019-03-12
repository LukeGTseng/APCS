package Unit_3;
public class Exercise_4 {
	public static void main(String[] args) {
		int[] a = {36,12, 25,19,46,31,22};
		System.out.println(range(a));
	}
	public static int range(int[] a) {
		int currmin= 1000;
		int currmax = 0;
		for(int i = 0; i<a.length-1;i++) {
			if(a[i]>a[i+1]&& a[i]>currmax) {
				currmax = a[i];
			} else if(a[i+1]>a[i]&& a[i+1]>currmax) {
				currmax = a[i+1];
			}
			if(a[i]>a[i+1]&& a[i+1]<currmin) {
				currmin = a[i+1];
			} else if(a[i+1]>a[i]&& a[i]<currmin) {
				currmin = a[i];
			}
		}
		int range = currmax-currmin;
		return range + 1;
	}
}
