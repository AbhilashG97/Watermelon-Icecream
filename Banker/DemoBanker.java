import java.util.Scanner;

public class DemoBanker {
    public static void main(String[] args) throws NoBalanceException {
        try (Scanner s = new Scanner(System.in)) {
            Banker b = new Banker(s.nextFloat());
            System.out.println(b.credit(s.nextFloat()));
            try {
                System.out.println(b.debit(s.nextFloat()));
            } catch (NoBalanceException nbe) {
                throw new NoBalanceException("Insufficient funds", nbe);
            }
        }
    }
}