class Liu {
    
    Liu() {
        System.out.println("I am happy.");
    }

    void fit(int a, int b) {
        System.out.println("The sum of the two numbers is " + (a+b));
    }
}

class Gou extends Liu {
    
    private String name;
    
    Gou(String name) {
        this.name = name;
        System.out.println("Ore wa " + name+ " desu.");
    }

    
    Gou(String grade, int marks) {
        System.out.println("I got "+grade+" grade which is "+marks+" marks.");
    }

    @Override
    void fit(int a, int b) {
        super.fit(23, 89);
        System.out.println("The product of the two numbers is : " + a*b);
    }

    {
    	//block
		System.out.println("So, this is what rage feels like.");
		name = "Jack";
		System.out.println(name);
    }

    static {
    	// static initializer block
        System.out.println("I am a static block and I will be invoked first.");
    }

    public static void main(String []args){
        Gou gou = new Gou("Louese");
        Gou fou = new Gou("O+", 105);
        gou.fit(23, 45);
        // Observe the output carefully
    }
}
