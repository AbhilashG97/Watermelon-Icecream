/**
 * This example demonstrates the use of 
 * Subjects 
 */

import io.reactivex.*;
import io.reactivex.observables.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * A simple Chocolate POJO
 */
class Chocolate {
    
    private StringBuilder chocolateName;
    private int chocolatePrice;
    
    public Chocolate(StringBuilder chocolateName, int chocolatePrice) {
        this.chocolateName = chocolateName;
        this.chocolatePrice = chocolatePrice;
    }

    public StringBuilder getChocolateName() {
        return chocolateName;
    }

    public int getChocolatePrice() {
        return chocolatePrice;
    }

    @Override
    public String toString() {
        return chocolateName.toString() + " - " + chocolatePrice;
    }

}

public class DragonFruit {

    /**
     * This is a method that fills an ArrayList with chocolates from an input string 
     * @param input A string which contains chocolates
     * @param chocolateList an empty ArrayList which will be filled with chocolates
     * @return an ArrayList filled with chocolates
     */
    public ArrayList<Chocolate> getFilledFruitList(String input, ArrayList<Chocolate> chocolateList) {
        Scanner chocolateListScanner = new Scanner(input);
        chocolateListScanner.useDelimiter(" "); 
        
        Scanner chocolateScanner = null;

        while(chocolateListScanner.hasNext()) {
            chocolateScanner = new Scanner(chocolateListScanner.next());
            chocolateScanner.useDelimiter(",");

            chocolateList.add(new Chocolate(new StringBuilder(fruitScanner.next()), 
                                    Integer.parseInt(fruitScanner.next())));
        }
        chocolateListScanner.close();
        return chocolateList;
    }
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the name of the chocolate and the chocolate price separated by a comma "+
        "followed by a space for subsequent chocolates.");

        StringBuilder result = new StringBuilder("");
        String userInput = scanner.nextLine();

        ArrayList<Chocolate> chocolateList = new ArrayList<>();
        chocolateList = new DragonFruit().getFilledDragonList(userInput, chocolateList);

        scanner.close();
    }
}