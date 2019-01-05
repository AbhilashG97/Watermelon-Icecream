@Fruit(name="Orange", price=12f)
public class Orange {

    @Override 
    public String toString() {
        return " ";
    }

    public static void main(String[] args) {
        Orange orange = new Orange();
        System.out.println(orange);
    }
}