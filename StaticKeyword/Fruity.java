public class Fruity {
    
    private static String fruitName;
    private int price;

    static {
        fruitName = "Watermelon";
    }

    public Fruity() {
        // Default
    }

    public Fruity(String fruitName, int price) {
        this.price = price;
        Fruity.fruitName = fruitName;
    }

    public void printStuff() {
        printFruitName();
        System.out.println(price);
    }

    public static void printFruitName() {
        System.out.println(fruitName);
    }
}

class Driver {
    public static void main(String[] args) {
        Fruity.printFruitName();

        System.out.println();

        new Fruity().printStuff();

        System.out.println();

        Fruity fruity = new Fruity("Kiwi", 100);
        fruity.printStuff();   
    }
}