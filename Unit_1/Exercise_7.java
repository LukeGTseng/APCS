public class Greeting {
	
	public static void name() {
		System.out.println("Luke Tseng");		
	}
	public static void address() {
		System.out.println("not giving my address");		
	}
	public static void studentid() {
		System.out.println("131276");		
	}
	
	public static void Library() {
		name();
		studentid();
	}
	
	public static void printAddress() {
		address();
	}
	
	public static void printname() {
		name();
		address();
		studentid();
	}
	
	public static void main(String[] args) {
		printAddress(); //To send me a letter
		Library(); //To check out a book at the library
		printname(); //To find my school transcript
	}
}
