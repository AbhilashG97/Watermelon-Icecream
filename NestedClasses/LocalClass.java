public class LocalClass {

	private String name; 

	public LocalClass(String name){
		this.name = name;
	}

	public LocalClass(){
		
	}

	public static void printName(){
		LocalClass lc = new LocalClass();
		System.out.println(lc.name);
		final String rollNum;

		{
			rollNum = "123";
		}

		class MyName {
			String name;
			MyName(String name){
				this.name = name;
			}
			void print(){
				System.out.println(name+" "+rollNum);
				//System.out.println(LocalClass.this.name);
			}
		}

		MyName n = new MyName("Rurouni");
		n.print();
	}

	public static void main(String[] args) {
		new LocalClass("Jack").printName();
	}
}