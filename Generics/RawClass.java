public class RawClass<T> {
    private T t;

    public RawClass(T t) {
        this.t = t;
    }

    public RawClass() {
        // Default constructor
    }

    public T getVar() {
        return t;
    }

    public void setVar(T t) {
        this.t = t;
    }
};