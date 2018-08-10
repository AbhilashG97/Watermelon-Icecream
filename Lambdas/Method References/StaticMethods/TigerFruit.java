import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TigerFruit {

    public static boolean areNumbersEven(int a, int b) {
        if(a%2 == 0 && b%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNumberEven(int a) {
        if(a%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void checkNumbers(int[] intArray, BiPredicate<Integer, Integer> biPredicate, String message) {
        for(int i : intArray) {
            if(biPredicate.test(i, i+10)) {
                System.out.println(message+" "+i+" "+(i+10));
            }
        }
    }

    public void checkNumber(int[] array, Predicate<Integer> predicate, String message) {
        for(int i : array) {
            if(predicate.test(i)) {
                System.out.println(i+" "+message);
            }
        }
    }

}
