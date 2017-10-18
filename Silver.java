class Silver {
    static {
        System.out.println("This is a static block.");
    }

    static int Cube(int x) {
        return x * x * x;
    }

    public static void main(String args[]) {
        int result = Silver.Cube(5);
        System.out.println(result);
    }
}