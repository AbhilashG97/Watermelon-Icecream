import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String x = s.nextLine();
            try {
                if ("Racoon".equals(x)) {
                    throw new RacoonException("I am a racoon.");
                }
            } catch (RacoonException re) {
                System.out.println(re);
            }
        }
    }
}