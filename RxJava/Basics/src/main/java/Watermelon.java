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
         * returns a 
         */
        new Watermelon().getTypedObservable(userInput)
                        .subscribe((string) -> {
                            result.append(string);
                        });
        System.out.println("The result is :"+ result.toString());

        /**
         * 
         */
        new Watermelon().getFruitObservables(fruitList)
                        .map(Fruit::getFruitName)
                        .subscribe(System.out::println,
                                  Throwable::printStackTrace,
                                  () -> {
                                    System.out.println("Completed");
                                  });
        
        scanner.close();
    }
}