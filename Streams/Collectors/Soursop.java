/**
 * An example to demonstrate the use of Collectors
 * in Java  
 */
import java.util.Scanner;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.*;

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

    public ArrayList<Dessert> getFilledArrayList(ArrayList<Dessert> arrayList, String input) {
        Scanner dessertScanner = new Scanner(input);
        dessertScanner.useDelimiter(" ");
        Scanner tempScanner = null;
        while(dessertScanner.hasNext()) {
            tempScanner = new Scanner(dessertScanner.next());
            tempScanner.useDelimiter(",");
            arrayList.add(new Dessert(new StringBuilder(tempScanner.next()),
                            Integer.parseInt(tempScanner.next())));
        }
        dessertScanner.close();
        return arrayList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Dessert> dessertList = new ArrayList<>();
        System.out.println("Enter dessert name and price with a comma inbetween followed by a space for"+
        " subsequent entries");
        String input = scanner.nextLine();

        dessertList = new Soursop().getFilledArrayList(dessertList, input);

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
         * A stream of dessert is partioned into two lists 
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
        System.out.println();

        /**
         * A stream of desserts is grouped by their price 
         * into maps
         * 
         * groupingBy() returns a Map collection whose key is the 
         * value returned by the functional interface
         */
        new Soursop().getDessertStream(dessertList)
                     .collect(Collectors.groupingBy(Dessert::getDessertPrice))
                     .forEach((key, value) -> {
                        System.out.println(key+" "+value);
                     });
        System.out.println();

        /**
         * A stream of desserts is grouped on the basis of their price and then it is mapped 
         * to the dessert's name using the Collectors.mapping() function.
         * 
         * The groupingBy() method takes a Collectors as a second argument, which can contain any 
         * collector method.  
         */
        new Soursop().getDessertStream(dessertList)
                     .collect(Collectors.groupingBy(Dessert::getDessertPrice,
                                                    Collectors.mapping(Dessert::getDessertName,
                                                                       Collectors.toCollection(ArrayList::new))))
                                                                       .forEach((key, value) -> {
                                                                           System.out.println(key+" "+value);
                                                                       });
        System.out.println();

        /**
         * Stream of Dessert id collected and grouped by its price and is then reduced to an integer 
         * value in a map. 
         * 
         * The integer value is the sum of all the dessert prices.
         * 
         * The reducing() method of the Collectors class takes in 3 parameters which are
         * similar to the reduce() method. 
         */
        new Soursop().getDessertStream(dessertList)
                     .collect(Collectors.groupingBy(Dessert::getDessertPrice,
                                                    Collectors.reducing(0, 
                                                                        Dessert::getDessertPrice,
                                                                        Integer::sum)))
                     .forEach((key, value) -> {
                         System.out.println(key+" "+value);
                     });
        System.out.println();

        /**
         * Stream of Dessert is collected and is grouped on the basis of their price.
         * It is also reduced to an Integer which is the sum of the 
         * prices of all the desserts in the stream grouped by their prices.
         */
        new Soursop().getDessertStream(dessertList)
                     .collect(Collectors.groupingBy(Dessert::getDessertPrice,
                                                    Collectors.summingInt(Dessert::getDessertPrice)))
                     .forEach((key, value) -> {
                         System.out.println(key+" "+value);
                     });
        System.out.println();

        /**
         * Stream of Dessert is collected and is grouped on the basis of their price.
         * It is also reduced to a statistical value which displays the all the statistical
         * information of the stream.
         */
        new Soursop().getDessertStream(dessertList)
                     .collect(Collectors.groupingBy(Dessert::getDessertPrice, 
                                                    Collectors.summarizingInt(Dessert::getDessertPrice)))
                     .forEach((key, value) -> {
                         System.out.println(key+" "+value);
                     });
        System.out.println();

        scanner.close();
    }
}