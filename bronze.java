class bronze {
    void m() {
        System.out.println("Hello, Wolrd!");
    }

    void n(int x, String name){
        this.m();
        System.out.println("Boku dake ga " + x + " Kore wa "+ name);
    } 

    public static void main(String[] args){
        bronze b = new bronze();
        b.n(23, "James Bond");
    }
}