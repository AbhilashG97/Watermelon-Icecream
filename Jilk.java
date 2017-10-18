import java.util.Scanner;

public class Jilk {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            if (s.nextInt() < 5) {
                throw new ArithmeticException("Enter a value greater than 5.");
            } else {
                System.out.println("You entered : " + s.nextInt());
            }
        }
    }
}
