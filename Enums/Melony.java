public class Melony {

    public enum Fruit {
        Watermelon, Mango, Cherry, Orange, Litchi, Guvva;
    }

    public static void main(String[] args) {
        
        for(Fruit i : Fruit.values()) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}