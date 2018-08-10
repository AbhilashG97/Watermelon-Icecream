import java.util.function.*;

public class Meowny {

    public DarkMelony createDarkMelony(Supplier<DarkMelony> supplier) {
        return supplier.get();
    }

    public DarkMelony createAnotherDarkMelony(BiFunction<String, String, DarkMelony> biFunction, String... args) {
        return biFunction.apply(args[0], args[1]);
    }

    public BeautifulMelony creaBeautifulMelony(String favoriteFruit, Function<String, BeautifulMelony> function) {
        return function.apply(favoriteFruit);
    }

    public static void main(String[] args) {
        DarkMelony darkMelony = new Meowny().createDarkMelony(DarkMelony::new);
        darkMelony.giveIdentity(darkMelony, "Pretty Melony", "Watermelon")
                  .saySomething();

        new Meowny().createAnotherDarkMelony(DarkMelony::new, "Beautiful Melony", "Seedless Watermelon")
                    .saySomething();

        new Meowny().creaBeautifulMelony("Watermelon", BeautifulMelony::new).saySomething();
    }
}