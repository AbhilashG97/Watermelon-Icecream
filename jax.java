interface fruit {
    void fruitName();
}

class Mango implements fruit {
    public void fruitName(){
        System.out.println("The name of this fruit is Mango.");
    }
}

class Banana implements fruit {
    public void fruitName(){
        System.out.println("The name of this fruit is Banana.");
    }
}

class jax {
    public static void main(String []args){
        fruit f;
        f = new Mango();
        f.fruitName();
        f = new Banana();
        f.fruitName();
    }
}