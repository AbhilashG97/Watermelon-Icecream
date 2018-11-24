import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.*;
import java.util.logging.*;

/**
 * An example to demonstrate Lazy Invocation of streams.
 * 
 * Strems are not executed unless there is a terminatory
 * operation associated with it.
 */
public class Pineapple {

    private final static Logger logger = Logger.getLogger(Pineapple.class.getName());
    private final String WATERMELON = "watermelon";
    private int counter = 0;

    public Stream<String> isWatermelonPresent(ArrayList<String> fruitList) {
        return fruitList.stream()   
                        .filter((fruit) -> {
                            counter++;
                            logger.info(String.valueOf(counter));
                            return fruit.contains(WATERMELON);  
                        } );
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {

        Pineapple pineapple = new Pineapple();
        ArrayList<String> fruitList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fruits after a space");
        String userInput = scanner.nextLine();

        Scanner stringScanner = new Scanner(userInput);
        stringScanner.useDelimiter(" ");

        while(stringScanner.hasNext()) {
            fruitList.add(stringScanner.next());
        }

        pineapple.isWatermelonPresent(fruitList);
        System.out.println("\nCounter before terminatory operation: "+pineapple.getCounter());
        
        System.out.println();

        pineapple.isWatermelonPresent(fruitList)
                 .collect(Collectors.toCollection(ArrayList<String>::new))
                 .forEach(System.out::print);
        System.out.println("\nCounter after terminatory operation: "+pineapple.getCounter());

        stringScanner.close();
        scanner.close();
    }
}