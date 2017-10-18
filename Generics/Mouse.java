public class Mouse {

    private int number;
    private String name;

    public Mouse(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void printValues() {
        System.out.printf("%s %d \n", name, number);
    }
}