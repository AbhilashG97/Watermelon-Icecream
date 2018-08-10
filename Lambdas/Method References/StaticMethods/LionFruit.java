import java.util.Scanner;

public class LionFruit {
    
    public static void main(String[] args) {

        int[] intArray = new int[] {12, 3, 5, 7, 9, 18, 13, 2, 44, 24, };

        Scanner scanner = new Scanner(System.in);

        new TigerFruit().checkNumbers(intArray, TigerFruit::areNumbersEven, scanner.nextLine());

        new TigerFruit().checkNumber(intArray, TigerFruit::isNumberEven, scanner.nextLine());
        
        scanner.close();
    }    
}