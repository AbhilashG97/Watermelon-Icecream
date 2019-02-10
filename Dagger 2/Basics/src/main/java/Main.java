public class Main {
    public static void main(String[] args) {

        FruitDessertComponent component = DaggerFruitDessertComponent
                                          .builder().build();
        System.out.println(component.inject().getFruitDessert());
    }
}