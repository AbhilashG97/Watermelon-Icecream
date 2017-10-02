public class CopyObj {
	private String name;
	private int roll;
	private static String className;

	public CopyObj(int roll, String name, String className){
		this();
		this.roll = roll;
		this.className = className;
		this.name = name;
	}

	public CopyObj(){
		System.out.println("This is a default constructor.");
	}

	CopyObj(String name){
		this.name = name;
		System.out.println(name);
	}

	public void display(){
		System.out.println("name : "+name+" Roll : "+roll+" Class name : "+className);
	}

	static public void myName(){
		className = "S7";
	}

	public void yourName(){
		myName();
		className = "S8";
		myName();
	}

	static {
		System.out.println("This is a static block.");
	}

	public static void main(String[] args) {
		CopyObj obj = new CopyObj(123, "Kali", "S3");

		obj.display();
	}
}