class june {
    june() {
        this(5);
        System.out.println("This is the first constructor.");
    }

    june(int x) {
        System.out.println("This is a second constructor. And the number that was entered is " + x);
    }

    public static void main(String args[]) {
        june n = new june();
        n.favFruit("Banana");
    }

    void apple() {
        System.out.println("This is an apple.");
    }

    void favFruit(String fName) {
        this.apple();
        System.out.println("This is my favorite fruit :" + fName);
    }
}
