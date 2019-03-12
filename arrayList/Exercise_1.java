package arrayLists;

import java.util.*;

public class Exercise_1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("u");
		list.add("r");
		list.add("e");
		list.add("l");
		list.add("i");
		list.add("o");
		list.add("n");
		list.add(" ");
		list.add("S");
		list.add("o");
		list.add("l");
		addStars(list);
		removeStars(list);
	}
	public static void addStars(ArrayList<String> list) {
		for(int i = 1; i<list.size(); i+=2) {
			list.add(i,"*");
		}
		System.out.println(list);
	}
	public static void removeStars(ArrayList<String> list) {
		for(int i = 1; i<list.size(); i++) {
			list.remove(i);
		}
		System.out.println(list);
	}
}
