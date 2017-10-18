public class Bronze {


    public static void main(String[] args) {
        Bronze b = new Bronze();
        b.n(23, "James Bond");
    }

    public void m() {
        System.out.println("Hello, Wolrd!");
    }

    public void n(int x, String name) {
        this.m();
        System.out.println("Boku dake ga " + x + " Kore wa " + name);
    }
}