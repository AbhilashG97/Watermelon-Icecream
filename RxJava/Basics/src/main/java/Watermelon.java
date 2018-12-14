import io.reactivex.*;
import java.util.Scanner;
import java.util.ArrayList;

class Fruit {

    private StringBuilder fruitName;
    private int fruitPrice;

    public Fruit(StringBuilder fruitName, int fruitPrice) {
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
    }

    public int getFruitPrice() {
        return fruitPrice;
    }

    public StringBuilder getFruitName() {
        return fruitName;
    }

    @Override
    public String toString() {
        return fruitName + "-" + fruitPrice+" ";
    }

}

public class Watermelon {

    /**
     * 
     * @param input : Takes input string from the user
     * @return Observable of type string taken from the user input
     */
    public Observable<String> getTypedObservable(String input) {
        return Observable.just(input);
    }

    /**
     * 
     * @param fruitList : Takes a list of Fruits
     * @return  a Observable of type Fruit
     */
    public Observable<Fruit> getFruitObservables(ArrayList<Fruit> fruitList) {
        return Observable.fromIterable(fruitList);
    }

    /**
     * A method that returns a nested Observable.
     * @param nestedFruitList The method takes a nested ArrayList as input
     * @return returns a nested Observable
     */
    public Observable<ArrayList<Fruit>> getObservableStuff(ArrayList<ArrayList<Fruit>> nestedFruitList) {
        return Observable.fromIterable(nestedFruitList);
    }

    public ArrayList<ArrayList<Fruit>> getFilledNestedFruitList(String fruits) {
        Scanner scanner = new Scanner(fruits);
        scanner.useDelimiter("\n");
        ArrayList<ArrayList<Fruit>> nestedFruitList = new ArrayList<>();
        while(scanner.hasNext()) {
            Scanner fruitListScanner = new Scanner(scanner.next());
            fruitListScanner.useDelimiter(" "); 
        
            Scanner fruitScanner = null;
            
            ArrayList<Fruit> tempFruitList = new ArrayList<>();

            while(fruitListScanner.hasNext()) {
                fruitScanner = new Scanner(fruitListScanner.next());
                fruitScanner.useDelimiter(",");



                tempFruitList.add(new Fruit(new StringBuilder(fruitScanner.next()), 
                                    Integer.parseInt(fruitScanner.next())));
            }
            nestedFruitList.add(tempFruitList);
            fruitListScanner.close();
        }
        scanner.close();
        return nestedFruitList;
    }


    /**
     * This method takes an empty fruit list and returns an ArrayList filled with Fruits
     * @param input input string containing the list of fruits
     * @param fruitList the empty ArrayList which needs to be filleds
     * @return an ArrayList that contains Fruits
     */
    public ArrayList<Fruit> getFilledFruitList(String input, ArrayList<Fruit> fruitList) {
        Scanner fruitListScanner = new Scanner(input);
        fruitListScanner.useDelimiter(" "); 
        
        Scanner fruitScanner = null;

        while(fruitListScanner.hasNext()) {
            fruitScanner = new Scanner(fruitListScanner.next());
            fruitScanner.useDelimiter(",");

            fruitList.add(new Fruit(new StringBuilder(fruitScanner.next()), 
                                    Integer.parseInt(fruitScanner.next())));
        }
        fruitListScanner.close();
        return fruitList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the name of the fruit and the fruit price separated by a comma "+
        "followed by a space for subsequent fruits.");

        StringBuilder result = new StringBuilder("");
        String userInput = scanner.nextLine();

        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList = new Watermelon().getFilledFruitList(userInput, fruitList);

        /**
         * returns a Disposable of a given user input
         */
        new Watermelon().getTypedObservable(userInput)
                        .subscribe((string) -> {
                            result.append(string);
                        });
        System.out.println("The result is :"+ result.toString());

        /**
         * returns a Disposable of type Fruit 
         */
        new Watermelon().getFruitObservables(fruitList)
                        .map(Fruit::getFruitName)
                        .subscribe(System.out::println,
                                  Throwable::printStackTrace,
                                  () -> {
                                    System.out.println("Completed");
                                  });
        System.out.println();

        /**
         * returns a flattened Observable from a nested nested ArrayList as a source. 
         * 
         * Please read this :
         * https://stackoverflow.com/questions/26684562/whats-the-difference-between-map-and-flatmap-methods-in-java-8
         * 
         * NOTE: Map vs FlatMap
         * 
         * Map will not reduce a 2D structure to a 1D structure. Any transformation performed using
         * Map will return a 2D structure. 
         * 
         * i.e. Obervable<ArrayList<Fruit>> will be reduced to Observable<Observable<Fruit>> if the 
         * transformation is performed using a map function. 
         * 
         * FlatMap on the other hand reduces Observable<ArrayList<Fruit>> to Observable<Fruit>; i.e. it flatens
         * a 2D structure to a 1D structure. 
         */      
        new Watermelon().getObservableStuff(new Watermelon().getFilledNestedFruitList(userInput))
                        .flatMap(Observable::fromIterable)
                        .map(Fruit::getFruitName)
                        .subscribe(System.out::println,
                                   Throwable::printStackTrace,
                                   () -> {
                                       System.out.println("Completed!");
                                   });    
        System.out.println();   

        /**
         * Here, a groupBy() operator is used which groups the observable of fruits 
         * into groups of expensive and cheap fruits. 
         * 
         * The groupBy() operator returns a <K> Observable<GroupedObservable<K,T>> 
         * depending on the criteria on which they were grouped. 
         * 
         * As the return value of the groupBy() operator is of a nested Observable type [2D structure], 
         * it can be subscribed twice.
         * 
         * StringBuilders are used to collect the respective fruits.  
         */
        StringBuilder expensiveFruit = new StringBuilder();
        StringBuilder cheapFruit = new StringBuilder();

        new Watermelon().getFruitObservables(fruitList)
                        .groupBy((fruit) -> {
                            return fruit.getFruitPrice() > 50 ? "EXPENSIVE" : "CHEAP";
                        })
                        .subscribe((group) -> {
                            group.subscribe((fruit) -> {
                                if (group.getKey().toString().equals("EXPENSIVE")) {
                                    expensiveFruit.append(fruit.toString());
                                } else {
                                    cheapFruit.append(fruit.toString());
                                }
                            });
                        }, 
                        Throwable::printStackTrace,
                        () -> {
                            System.out.println("Expensive fruits : "+expensiveFruit);
                            System.out.println("Cheap fruits : "+cheapFruit);
                        });
        System.out.println();

        /**
         * The code snippet given below demonstartes the use of
         * filter opertor which is used to filter events based on 
         * a Predicate
         */
        StringBuilder someExpensiveFruits = new StringBuilder();

        new Watermelon().getFruitObservables(fruitList)
                        .filter((fruit) -> {
                            return fruit.getFruitPrice() > 50;
                        })
                        .subscribe((fruit) -> {
                            someExpensiveFruits.append(fruit.toString());
                        }, 
                        Throwable::printStackTrace,
                        () -> {
                            System.out.println("Some expensive fruits are : " + someExpensiveFruits);
                        });
        System.out.println();

        /**
         * The below code shows an example of defaultIfEmpty() operator which returns 
         * a default value if the observable is empty.
         * 
         * In the below example, if the source observable is empty, then a Square Watermelon 
         * will be returned.
         */
        new Watermelon().getFruitObservables(fruitList)
                        .defaultIfEmpty(new Fruit(new StringBuilder("Square Watermelon"),
                                        150))
                        .subscribe(System.out::println,
                                  Throwable::printStackTrace,
                                  () -> System.out.println("Completed!"));
        System.out.println();

        /**
         * takeWhile() is also a similar operator that takes Predicate as an
         * argument, but it only allows those events SO LONG AS each item 
         * satisfied a specified condition.
         * 
         * takeWhile() stops sending events on the first occurence of a false 
         * value.
         * 
         * Also, few other examples are as follows : 
         * Contain, SkipWhile, SkipUntil, TakeUntil
         */
        System.out.println("Some cheap fruits : ");
        new Watermelon().getFruitObservables(fruitList)
                        .takeWhile((fruit) -> fruit.getFruitPrice() < 50)
                        .subscribe(System.out::println, 
                                   Throwable::printStackTrace,
                                   () -> System.out.println("Completed!!"));
        System.out.println();

        /**
         * scan() operator is used to accumulate all the values of
         * emitted by a source. 
         * 
         * Here, the scan() operator takes BiFunction<T,T,T> as an argument
         * which acts as an accumulator.
         * 
         * Please read this : 
         * http://reactivex.io/documentation/operators/scan.html
         */
        new Watermelon().getFruitObservables(fruitList)
                        .map(Fruit::getFruitName)
                        .scan((a,b) -> a.append(b))
                        .subscribe(System.out::println,
                                  Throwable::printStackTrace,
                                  () -> System.out.println("Completed!!"));
        System.out.println();

        /**
         * Here too, a scan operator is being used which 
         * acuumulates all the values generated by the 
         * observable.
         * 
         * This overloaded method also contains an initial value as a first 
         * argument in the method given below. 
         */
        new Watermelon().getFruitObservables(fruitList)
                        .map(Fruit::getFruitPrice)
                        .scan(10, (a, b) -> a+b)
                        .subscribe(System.out::println,
                                   Throwable::printStackTrace,
                                   () -> {
                                       System.out.println("Completed!!");
                                   });
        System.out.println();

        scanner.close();
    }
}