import java.util.function.*;
import java.util.ArrayList;

public class PuppyFruit {

    public void someMethod(ArrayList<Dragon> dragonList, Consumer<Dragon> consumer) {
        for(Dragon dragon : dragonList) {
            consumer.accept(dragon);
        }
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

        // Using anaonymous class

        new PuppyFruit().someMethod(dragonList, (dragon) -> {
            dragon.saySomething(dragon.getDragonName());
        });

        System.out.println("\n Yahooooo \n");

        // Here, the consumer is consuming an instance of the Dragon class
        // which is passed as an argument in the accept() method 

        new PuppyFruit().someMethod(dragonList, Dragon::saySomething);
    }
}