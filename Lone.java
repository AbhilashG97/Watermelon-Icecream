class Test {
    final void display() {
        System.out.println("This is a test method.");
    }
}

class Lone extends Test {
    public static void main(String[] args) {
        Lone t = new Lone();
        t.display();
    }
}