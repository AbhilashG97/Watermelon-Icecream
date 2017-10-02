class C { 
	public int c = 5;
		public C(){
		System.out.println("C "+c);
	}

	public void name(String name){
		System.out.println("C"+name);
	}
}

class B extends C {
	public int b = 10;
		public B(){
		System.out.println("B "+b);
	}

	public void name(String name){
		System.out.println("B"+name);
	}
}

class A extends B {
	A(){
		super();
	}

	public void name(String name){
		super.name("A for apple");
		System.out.println(name);
	}
	public static void main(String[] args) {
		A aObj = new A();
	aObj.name("Sam");
	}
}