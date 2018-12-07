/**
 * An example to demonstrate the use of Collectors
 * in Java  
 */

import java.util.Scanner;
import java.util.stream.*;
import java.util.ArrayList;

/**
 * A simple dessert POJO
 */
class Dessert {
    private StringBuilder dessertName;
    private int dessertPrice;

    public Dessert(StringBuilder dessertName, int dessertPrice) {
        this.dessertName = dessertName;
        this.dessertPrice = dessertPrice;
    }

    public StringBuilder getDessertName() {
        return dessertName;
    }

    public int getDessertPrice() {
        return dessertPrice;
    }

    @Override 
    public String toString() {
        return dessertName+" "+dessertPrice;
    }
}

public class Soursop {
    
    public Stream<Dessert> getDessertStream(ArrayList<Dessert> dessertList) {
        return dessertList.stream();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Dessert> dessertList = new ArrayList<>();
        System.out.println("Enter dessert name and price with a comma inbetween followed by a space for"+
        " subsequent entries");
        Scanner dessertScanner = new Scanner(scanner.nextLine());
        dessertScanner.useDelimiter(" ");
        Scanner tempScanner = null;
        while(dessertScanner.hasNext()) {
            tempScanner = new Scanner(dessertScanner.next());
            tempScanner.useDelimiter(",");
            dessertList.add(new Dessert(new StringBuilder(tempScanner.next()),
             Integer.parseInt(tempScanner.next())));
        }

        /**
         * Reduce all the elements using the joining() method of the
         * Collectors class, it returns a string in which all 
         * the contents are joined
         */
        String result = new Soursop().getDessertStream(dessertList)
                     .map(Dessert::getDessertName)
                     .collect(Collectors.joining(":", "(", ")"));
        System.out.println("Joined desserts are: "+result);
        /**
         * Reduces all the elemenst using the summingInt() method of the
         * Colllectors class
         * 
         * summingInt() transforms the stream and also calculates the summ
         */
        int totalPrice = new Soursop().getDessertStream(dessertList)
                                      .collect(Collectors.summingInt(Dessert::getDessertPrice));
        System.out.println("Total price of all the desserts are: "+totalPrice);

        /**
         * All the statistical data related to a stream of Desserts can be
         * obtained using summarizingInt() method
         * 
         * The count, sum, min, max and average values are obtained through it
         * 
         * NOTE: The stream has to mapped to appropriate data types before the 
         * summarizing methods can be used 
         */
        String summaryOfDesserts = new Soursop().getDessertStream(dessertList)
                     .collect(Collectors.summarizingInt(Dessert::getDessertPrice))
                     .toString();
        System.out.println(summaryOfDesserts);
        

        /**
         * Here a stream of dessert is partioned into two lists 
         * depending on a condition provided by the predicate 
         * functional interface
         * 
         * partioningBy() returns a Map collection
         */
        new Soursop().getDessertStream(dessertList)
                     .collect(Collectors.partitioningBy((dessert) -> {
                         return dessert.getDessertPrice() > 10;
                     }))
                     .forEach((key, value) -> {
                        System.out.println(key + " " + value);
                     });

        dessertScanner.close();
        scanner.close();
    }
}