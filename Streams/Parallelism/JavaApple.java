/**
 * Example to demomstrate Parallelism in Streams
 */
import java.util.Scanner;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A simple Beverage POJO
 */
class Beverage {
    private StringBuilder beverageName;
    private int beveragePrice;

    public Beverage(StringBuilder beverageName, int beveragePrice) {
        this.beverageName = beverageName;
        this.beveragePrice = beveragePrice;
    }

    public StringBuilder getBeverageName() {
        return beverageName;
    }

    public int getBeveragePrice() {
        return beveragePrice;
    }

    @Override
    public String toString() {
        return beverageName.toString() + "-" + beveragePrice+" ";
    }
}

/**
 * To invoke a parallel stream either use - parallelStream() or parallel()
 * 
 * parallelStream should only be used for Collections and parallel for the
 * other Basestream
 */
public class JavaApple {    

    public ArrayList<Beverage> getFilledArrayList(ArrayList<Beverage> beverages, String input) {
        Scanner beverageScanner = new Scanner(input);
        beverageScanner.useDelimiter(" ");

        Scanner tempScanner = null;

        while(beverageScanner.hasNext()) {
            tempScanner = new Scanner(beverageScanner.next());
            tempScanner.useDelimiter(",");
            beverages.add(new Beverage(new StringBuilder(tempScanner.next()), Integer.parseInt(tempScanner.next())));
        }

        tempScanner.close();
        beverageScanner.close();
        return beverages;
    }

    public Stream<Beverage> getBeveragesStream(ArrayList<Beverage> beverages) {
        return beverages.stream();
    }

    public Stream<Beverage> getConcurrentBeverageStream(ArrayList<Beverage> beverages) {
        return beverages.parallelStream();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter beverage name and beverage price separted by a comma followed by "+
                           "spaces for subsequent beverages.");
        ArrayList<Beverage> beverages = new ArrayList<>();
        beverages = new JavaApple().getFilledArrayList(beverages, scanner.nextLine());

        System.out.println(beverages);

        /**
         * A concurrent stream that reduces the stream to an integer
         */
        int sum = new JavaApple().getConcurrentBeverageStream(beverages)
                       .map(Beverage::getBeveragePrice)
                       .reduce((totalPrice, individualPrice) -> {
                            return totalPrice+individualPrice;
                       })
                       .get();
        System.out.println(sum);

        /**
         * A concurrent stream is processed by the Java compiler and runtime.
         * They aren't executed in the order in which they are defined.
         */
        new JavaApple().getConcurrentBeverageStream(beverages)
                       .forEach(System.out::print);
        System.out.println();
        new JavaApple().getConcurrentBeverageStream(beverages)
        .forEach(System.out::print);
        System.out.println();

        /**
         * Adding an element to a collection is a stateful lambda expression
         * Statful lambda expression can give unexpected results when executed 
         * espicially in case of parallel stream
         */
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,10));
        ArrayList<Integer> serialStorage = new ArrayList<>();
        /**
         * A thread safe collection is created so as to prevent multiple-threads from 
         * accessing it at the same time.
         */
        List<Integer> concurrentStorage = Collections.synchronizedList(new ArrayList<Integer>());

        integerList.stream()
                   .map((integer) -> {
                        serialStorage.add(integer);
                        return integer;
                    })
                   .forEachOrdered((element) -> {
                        System.out.print(element+" ");
                   });
        System.out.println();

        serialStorage.stream()
                     .forEachOrdered((element) -> {
                         System.out.print(element+" ");
                     });
        System.out.println("\n-------------------------\n");

        integerList.parallelStream()
                   .map((integer) -> {
                       concurrentStorage.add(integer);
                       return integer;
                   })
                   .forEachOrdered((element) -> {
                       System.out.print(element+" ");
                   });
        System.out.println();

        concurrentStorage.parallelStream()
                         .forEachOrdered((element) -> {
                             System.out.print(element+" ");
                         });
        System.out.println();

        scanner.close();
    }
}