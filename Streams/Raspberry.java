import java.util.Scanner;
import java.util.stream.*;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Raspberry {

    public Stream<String> getFruitStream(String fruitList) {
        return Pattern.compile(",").splitAsStream(fruitList);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fruits in a line separated by a comma\n");
        String fruitCSV = scanner.nextLine();

        new Raspberry().getFruitStream(fruitCSV)
                       .collect(Collectors.toCollection(ArrayList::new))
                       .forEach(System.out::println);

        System.out.println("\nSorted fruits\n");

        /**
         * A stream pipline consists of source, 
         * intermediate operation and a terminal operation.
         */
        new Raspberry().getFruitStream(fruitCSV)
                       .sorted()
                       .collect(Collectors.toCollection(ArrayList::new))
                       .forEach(System.out::println);

        System.out.println("Number of fruits :" + new Raspberry().getFruitStream(fruitCSV)
                                                                 .sorted()
                                                                 .count());

        scanner.close();
    }    
}