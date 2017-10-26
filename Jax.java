interface Fruit {
    void fruitName();
}

class Mango implements Fruit {
    public void fruitName(){
        System.out.println("The name of this fruit is Mango.");
    }
}

class Banana implements Fruit {
    public void fruitName(){
        System.out.println("The name of this fruit is Banana.");
    }
}

class Jax {
    public static void main(String []args){
        Fruit f;
        f = new Mango();
        f.fruitName();
        f = new Banana();
        f.fruitName();
    }
}