interface name {
	default void myName(){
		System.out.println("Hello.");
	}
}

class A implements name{
	@Override
	public void myName(){
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		A a = new A();
		a.myName();
	}
}
