public class Main {
    public static void main(String[] args) {

        FruitDessertComponent component = DaggerFruitDessertComponent
                                          .create();
        System.out.println(component.inject().getFruitDessert());

    }
}