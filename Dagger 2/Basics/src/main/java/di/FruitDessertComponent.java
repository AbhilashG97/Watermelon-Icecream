import dagger.Component;

@Component(modules = {FruitDessertModule.class})
public interface FruitDessertComponent {
    
    FruitDessert inject();
    
}