import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FruitDessertModule_ProvideFruitFactory implements Factory<Fruit> {
  private final FruitDessertModule module;

  public FruitDessertModule_ProvideFruitFactory(FruitDessertModule module) {
    this.module = module;
  }

  @Override
  public Fruit get() {
    return provideInstance(module);
  }

  public static Fruit provideInstance(FruitDessertModule module) {
    return proxyProvideFruit(module);
  }

  public static FruitDessertModule_ProvideFruitFactory create(FruitDessertModule module) {
    return new FruitDessertModule_ProvideFruitFactory(module);
  }

  public static Fruit proxyProvideFruit(FruitDessertModule instance) {
    return Preconditions.checkNotNull(
        instance.provideFruit(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
