import javax.inject.Inject;
import dagger.*;

public class FruitDessert {
    
    private Fruit fruit;
    private Icecream icecream;

    public FruitDessert() {

    }

    @Inject
    public FruitDessert(Fruit fruit, Icecream icecream) {
        this.fruit = fruit;
        this.icecream = icecream;
    }

    public String getFruitDessert() {
        return "Here is an awesome dessert :" + fruit.getFruitName() +
               " " +icecream.getIcecreamName();
    }
}