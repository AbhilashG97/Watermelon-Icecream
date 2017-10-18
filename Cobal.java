class Cobal {

    public static void main(String[] args) {
        cobal b = new cobal();
        int reA, reB;
        reA = b.add(34, 56);
        reB = b.add(100, 100, 200);
        System.out.println(reA + " " + reB);
    }

    int add(int x, int y) {
        return x + y;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}