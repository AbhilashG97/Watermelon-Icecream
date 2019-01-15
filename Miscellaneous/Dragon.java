class Fruit {
    public void talk() {
        System.out.println("This is how I look like I talk.");
    }
}

public class Dragon extends Fruit {
    @Override
    public void talk() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.talk();
    }
}
