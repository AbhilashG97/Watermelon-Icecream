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
    public static void main(String... args) {

    }
}