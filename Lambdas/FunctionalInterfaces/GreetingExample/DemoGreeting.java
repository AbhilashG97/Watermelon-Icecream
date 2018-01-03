public class DemoGreeting {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.showGreeting(() -> System.out.println("Namaste"));
    }
}