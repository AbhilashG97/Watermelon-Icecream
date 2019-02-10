import dagger.Component;
import dagger.Provides;
import dagger.Module;

@Module
public class FruitDessertModule {

    @Provides
    public Fruit provideFruit() {
        return new Fruit("Watermelon", 120);
    }

    @Provides
    public Icecream provideIcecream() {
        return new Icecream("Watermelon Icecream", 300);
    }
}