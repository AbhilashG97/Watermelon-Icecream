/**
 * Contructor chaining example
 */

class Fruit {

    private String fruitName;

    public Fruit() {
        //Default
    }

    public Fruit(String fruitName) {
        this.fruitName = fruitName;
    }

    public void sayFruitName() {
        System.out.println(fruitName);
    }

}

public class Melon extends Fruit {

    private int price;

    public Melon() {
        //default
        this(23);
    }

    public Melon(int price) {
        this.price = price;
    }

    public void sayPrice() {
        System.out.println(price);
    }

    public static void main(String[] args) {
        Melon melon = new Melon();
        melon.sayPrice();
        melon.sayFruitName();
    }
}
