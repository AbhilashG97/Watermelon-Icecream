public class Crash {
	private static String name = "Hiromi";
	String home = "Isreal";

	static void printString(){
		System.out.println(name);
	}

	void printStringDuplicate(){
		System.out.println(name+home);
	}

	public static void main(String[] args) {
		Crash c= new Crash();
		c.printString();
		c.printStringDuplicate();
	}
}