/**
 * An Example to demonstrate stream reduction
 */
import java.util.Scanner;
import java.util.stream.*;
import java.util.ArrayList;

/**
 * A simple Fruit POJO
 */
class Fruit {

    private StringBuilder fruitName;
    private int price;

    public Fruit(StringBuilder fruitName, int price) {
        this.fruitName = fruitName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public StringBuilder getFruitName() {
        return fruitName;
    }

    @Override
    public String toString() {
        return fruitName.toString()+" "+price;
    }
}

public class Sapote {

    public Stream<Fruit> getFruitStream(ArrayList<Fruit> fruitList) {
        return fruitList.stream();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Fruit> fruitList = new ArrayList<>();

        System.out.println("Enter fruit and price separated by a comma"+
                           " followed by a space\n");

        Scanner stringScanner = new Scanner(scanner.nextLine());
        stringScanner.useDelimiter(" ");

        Scanner tempScanner = null;

        while(stringScanner.hasNext()) {
            tempScanner = new Scanner(stringScanner.next());
            tempScanner.useDelimiter(",");
            fruitList.add(new Fruit(new StringBuilder(tempScanner.next()), Integer.parseInt(tempScanner.next())));    
        }

        System.out.println(fruitList);


        /**
         * Maps a Fruit Stream to an integer stream 
         */
        int totalPrice = new Sapote().getFruitStream(fruitList)
                    .filter((fruit) -> {
                        return fruit.getFruitName()
                                    .toString()
                                    .contains("a"); 
                                })
                    .mapToInt((fruit) -> {
                        return fruit.getPrice();
                    })
                    .sum();

        System.out.println("Total Price of fruits which has 'a' in it are: "+totalPrice);
        
        /**
         * A reduce aggregrate operation 3 three parameters and also has 
         * has 3 overloaded methods
         * 
         * The 3 parameters are - 
         * 
         * 1. Identity [Initial value]
         * 2. Accumulator 
         * 3. Combiner 
         */

        /**
         * Reduces a stream of fruits to a stream of StringBuilder
         * and then finally the stream is reduced to a collection
         * i.e. ArrayList
         * 
         * NOTE: In the below example, BinaryOperator<T> is used which extends
         * BiFunction<T,T,T>
         * 
         * IMPORTANT: Reduce operation affects the ArrayList as well. The elements 
         * present in it will also get modified according to what has been specified 
         * in the reduce operation
         */
        new Sapote().getFruitStream(fruitList)
                    .map(Fruit::getFruitName)
                    .reduce((allFruits, fruit) -> allFruits.append("-"+fruit))
                    .stream()
                    .forEach(System.out::println);
        System.out.println(fruitList);
        System.out.println();
        /**
         * In the below example identity and BinaryOperator are being used. 
         */
        StringBuilder fruits = new Sapote().getFruitStream(fruitList)
                    .map((fruit) -> {return fruit.getFruitName();})
                    .sorted()
                    .reduce(new StringBuilder("Watermelon"), 
                            (allFruits, fruit) -> allFruits.append("-"+fruit));

        System.out.println("List of fruits are: "+fruits);
        System.out.println();            

        new Sapote().getFruitStream(fruitList)
                    .map((fruit) -> {return fruit.getFruitName();})
                    .sorted()
                    .forEach(System.out::println);

        stringScanner.close();
        tempScanner.close();
        scanner.close();
    }
}