public class Demo {
    public static void main(String[] args) {
        FruitThread fruitThread = new FruitThread(() -> System.out.println("Watermelon"));
        fruitThread.start();
    }
}