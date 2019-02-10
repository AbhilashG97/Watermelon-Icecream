import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FruitDessert_Factory implements Factory<FruitDessert> {
  private final Provider<Fruit> fruitProvider;

  private final Provider<Icecream> icecreamProvider;

  public FruitDessert_Factory(Provider<Fruit> fruitProvider, Provider<Icecream> icecreamProvider) {
    this.fruitProvider = fruitProvider;
    this.icecreamProvider = icecreamProvider;
  }

  @Override
  public FruitDessert get() {
    return provideInstance(fruitProvider, icecreamProvider);
  }

  public static FruitDessert provideInstance(
      Provider<Fruit> fruitProvider, Provider<Icecream> icecreamProvider) {
    return new FruitDessert(fruitProvider.get(), icecreamProvider.get());
  }

  public static FruitDessert_Factory create(
      Provider<Fruit> fruitProvider, Provider<Icecream> icecreamProvider) {
    return new FruitDessert_Factory(fruitProvider, icecreamProvider);
  }

  public static FruitDessert newFruitDessert(Fruit fruit, Icecream icecream) {
    return new FruitDessert(fruit, icecream);
  }
}
