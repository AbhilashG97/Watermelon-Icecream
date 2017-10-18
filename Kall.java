interface Jilk {
    void pull();

    default void say() {
        System.out.println("There is a saying in English.");
    }
}

class Kam implements Jilk {
    public void pull() {
        System.out.println("This is a print statement.");
    }

    @Override
    public void say() {
        System.out.println("There used to be a saying in English.");
    }
}

class Kall extends Kam {
    public static void main(String[] args) {
        Kam k = new Kall();
        k.say();
        k.pull();
    }
}