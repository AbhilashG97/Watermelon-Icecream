interface name {
    default void myName() {
        System.out.println("Hello.");
    }
}

class A implements name {
    public static void main(String[] args) {
        A a = new A();
        a.myName();
    }

    @Override
    public void myName() {
        System.out.println("Bye");
    }
}
