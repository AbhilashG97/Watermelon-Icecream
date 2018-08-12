import java.util.Arrays;
import java.util.stream.Stream;

public class Watermelon {

    public static void main(String[] args) {
        
        String[] myArray = new String[] {"watermelon", "apple", "banana", "kiwi", "dragon fruit"};
        
        Stream<String> fruityStream = Arrays.stream(myArray);

        Stream<String> anotherFruityStream = Stream.of("watermelon", "apple", "muskmelon", "pineapple");

        fruityStream.forEach((fruit) -> System.out.print(fruit+" "));
        System.out.println();
        
        anotherFruityStream.forEach((a) -> System.out.print(a+" "));
        System.out.println();
    }
}