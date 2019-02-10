import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FruitDessertModule_ProvideIcecreamFactory implements Factory<Icecream> {
  private final FruitDessertModule module;

  public FruitDessertModule_ProvideIcecreamFactory(FruitDessertModule module) {
    this.module = module;
  }

  @Override
  public Icecream get() {
    return provideInstance(module);
  }

  public static Icecream provideInstance(FruitDessertModule module) {
    return proxyProvideIcecream(module);
  }

  public static FruitDessertModule_ProvideIcecreamFactory create(FruitDessertModule module) {
    return new FruitDessertModule_ProvideIcecreamFactory(module);
  }

  public static Icecream proxyProvideIcecream(FruitDessertModule instance) {
    return Preconditions.checkNotNull(
        instance.provideIcecream(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
