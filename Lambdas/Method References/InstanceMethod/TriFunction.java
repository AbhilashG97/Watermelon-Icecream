@FunctionalInterface
public interface TriFunction<E, F, G, R> {

    R apply(E e, F f, G g);

}