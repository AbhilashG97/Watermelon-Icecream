public interface AnonymousInterface {

    public default void printText() {
        System.out.println("Yay, this is an AnonymousInterface");
    }

    public void printName(String name);
} 