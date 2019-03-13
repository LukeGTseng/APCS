package Recursion;
import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Scanner s = new Scanner(System.in);
		int target = s.nextInt();
		int max = arr.length-1;
		System.out.println(binarySearch(arr,target,0,max));
	}
	
	public static int binarySearch(int[] arr, int target, int min, int max) {
		if(min > max) {
			return -(min + 1);
		}
		int mid = (min + max) / 2;
        if (arr[mid] < target) {
        	return binarySearch(arr,target,mid+1,max);
        } else if (arr[mid] > target) {
            return binarySearch(arr,target,min,mid-1);
        } else {
            return mid;
        }
	}
}
