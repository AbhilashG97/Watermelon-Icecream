import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerFruitDessertComponent implements FruitDessertComponent {
  private FruitDessertModule fruitDessertModule;

  private DaggerFruitDessertComponent(Builder builder) {
    this.fruitDessertModule = builder.fruitDessertModule;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static FruitDessertComponent create() {
    return new Builder().build();
  }

  @Override
  public FruitDessert inject() {
    return new FruitDessert(
        FruitDessertModule_ProvideFruitFactory.proxyProvideFruit(fruitDessertModule),
        FruitDessertModule_ProvideIcecreamFactory.proxyProvideIcecream(fruitDessertModule));
  }

  public static final class Builder {
    private FruitDessertModule fruitDessertModule;

    private Builder() {}

    public FruitDessertComponent build() {
      if (fruitDessertModule == null) {
        this.fruitDessertModule = new FruitDessertModule();
      }
      return new DaggerFruitDessertComponent(this);
    }

    public Builder fruitDessertModule(FruitDessertModule fruitDessertModule) {
      this.fruitDessertModule = Preconditions.checkNotNull(fruitDessertModule);
      return this;
    }
  }
}
