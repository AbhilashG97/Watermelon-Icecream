class Liu {

    liu() {
        System.out.println("I am happy.");
    }

    void fit(int a, int b) {
        System.out.println("The sum of the two numbers is " + (a + b));
    }
}

class Gou extends Liu {

    static {
        System.out.println("I am a static block and I will be invoked first.");
    }

    String name;

    {
        System.out.println("So, this is what rage feels like.");
        name = "Jack";
        System.out.println(name);
    }

    Gou(String name) {
        this.name = name;
        System.out.println("Ore wa " + name + " desu.");
    }

    G(String grade, int marks) {
        System.out.println("I got " + grade + " grade which is " + marks + " marks.");
    }

    public static void main(String[] args) {
        Gou g = new Gou("Louese");
        Gou f = new Gou("O+", 105);
        g.fit(23, 45);
    }

    @Override
    void fit(int a, int b) {
        super.fit(23, 89);
        System.out.println("The product of the two numbers is : " + a * b);
    }
}