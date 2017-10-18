class Fruit {
    String fruitName;
    double price;

    public Fruit(String fruitName, double price) {
        this.fruitName = fruitName;
        this.price = price;
    }
}

class tully {
    Fruit fruit;
    int plucked_on;

    tully(Fruit fruit, int plucked_on) {
        this.fruit = fruit;
        this.plucked_on = plucked_on;
    }

    public static void main(String args[]) {
        Fruit f = new Fruit("Apple", 25.50);
        tully y = new tully(f, 25);
        y.display();
    }

    void display() {
        System.out.println("The fruit was plucked on :" + plucked_on + "\nThe name of the fruit is :" + fruit.fruitName + "\nThe price of the fruit is :" + fruit.price);
    }
}