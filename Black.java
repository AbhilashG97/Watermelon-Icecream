class Black {
    int a, b;

    Black(int d) {
        a = d * d;
    }

    Black(int g, int h, int j) {
        b = g * h * j;
    }

    public static void main(String args[]) {
        Black o = new Black(5);
        black i = new Black(2, 4, 6);
        o.print();
        i.print();
    }

    void print() {
        System.out.println(a + "" + b);
    }
}