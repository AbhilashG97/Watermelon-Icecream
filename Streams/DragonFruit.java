import java.util.Arrays;
import java.util.stream.Stream;

public class DragonFruit {

    public static void main(String[] args) {

        int[] integerArray = new int[] {12, 44, 35, 5, 7, 9, 31};
        Integer[] realIntegerArray = Arrays.stream(integerArray).boxed().toArray(Integer[] :: new);

        Stream<Integer> intStream = Arrays.stream(realIntegerArray);
        
        intStream.forEach((a) -> {
            if(a % 2 == 0) {
                System.out.print("Even number "+a);
            } else {
                System.out.print("Odd number "+a);
            }
            System.out.println();
        });
        
    }    
}