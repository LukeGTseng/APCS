package Unit_2;

public class Exercise_6 {
	public static void main(String[] args) {
		whatsThis("hello");
		whatsThis(5);
		whatsThis(3+3);
		//whatsThis(1.2+3.5); this is a double
		whatsThis(1 + 'a');
		whatsThis("hello" + "world");
	}	
	public static void whatsThis(String str) {
		System.out.println("String " + str);
	}
	public static void whatsThis(int num) {
		System.out.println("int " + num);
	}
}
