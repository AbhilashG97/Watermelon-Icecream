class liu {
    
    liu() {
        System.out.println("I am happy.");
    }     
        void fit(int a, int b) {
            System.out.println("The sum of the two numbers is " + (a+b));
        }
    }

class gou extends liu {
    
    String name;
    gou(String name) {
        this.name = name;
        System.out.println("Ore wa " + name+ " desu.");
    }

    gou(String grade, int marks) {
        System.out.println("I got "+grade+" grade which is "+marks+" marks.");
    }

    @Override
    void fit(int a, int b) {
        super.fit(23, 89);
        System.out.println("The product of the two numbers is : " + a*b);
    }

    {
    System.out.println("So, this is what rage feels like.");
    name = "Jack";
    System.out.println(name);
    }

    static {
        System.out.println("I am a static block and I will be invoked first.");
    }
    public static void main(String []args){
        gou g = new gou("Louese");
        gou f = new gou("O+", 105);
        g.fit(23, 45);
    }
}