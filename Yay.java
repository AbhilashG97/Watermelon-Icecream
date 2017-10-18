import java.util.Scanner;

public class Yay {
    private String name;
    private int roll;

    public Yay(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            Yay y = new Yay(s.next(), s.nextInt());
            y.display();
        }
    }

    public void display() {
        System.out.println("Name : " + name + "\nRoll : " + roll);
    }
}