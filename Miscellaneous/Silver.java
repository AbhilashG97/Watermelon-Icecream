class Silver {
    static int cube (int x) {
        return x*x*x;
    }

    static {
        System.out.println("This is a static block.");
    }
    public static void main (String args[]){
        int result = Silver.cube(5);
        System.out.println(result);
    }
}