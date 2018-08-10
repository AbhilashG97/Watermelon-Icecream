import java.util.function.*;
import java.util.ArrayList;

public class RedVelvet {    

    public void doSomethingFun(ArrayList<Dragon> dragons, Function<Dragon, String> function) {
        
        // forEach uses Consumer functional interface to cosume the 
        // elements present inside a collection. 

        dragons.forEach((dragon) -> {
            function.apply(dragon);
        });

        // The Function functional interface here is being
        // used here to demonstrate method references in Java   

    }

    public static void main(String[] args) {

        ArrayList<Dragon> dragonList = new ArrayList<>();

        dragonList.add(new Dragon("Jade"));
        dragonList.add(new Dragon("Fire"));
        dragonList.add(new Dragon("Iron"));
        dragonList.add(new Dragon("Lightening - Fire"));
        dragonList.add(new Dragon("Wind"));
        dragonList.add(new Dragon("Water"));
        dragonList.add(new Dragon("Sand"));

        // saySometingElse is a method that is being called inside the 
        // accept(Dragon dragon) method, since the accept method requires
        // a String to be returned as defined in the declaration of the Function 
        // functional interface

        new RedVelvet().doSomethingFun(dragonList, Dragon::saySomethingElse);
    }
}