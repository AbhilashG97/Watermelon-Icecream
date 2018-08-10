import java.util.function.*;

public class RedMelony {

    public void doSomethingFun(RedKiwi redkiwi, Consumer<RedKiwi> cosumer) {
        cosumer.accept(redkiwi);
    }

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        RedKiwi redKiwi = new RedKiwi("Red", "Heavenly");

        new RedMelony().doSomethingFun(redKiwi, fruit::kiwiTaste);
    }

}