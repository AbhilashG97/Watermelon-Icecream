import java.util.ArrayList;
import java.util.Iterator;


public class RedMelony {

    public void doSomethingFun(ArrayList<Dragon> dragons,
                               ArrayList<Dinosor>  dinosors,
                               ArrayList<Watermelon> watermelons,
                               TriFunction<Dragon, Dinosor, Watermelon, String> triFunction) {

        Iterator<Dragon> dragonIterator = dragons.iterator();
        Iterator<Dinosor> dinosorIterator = dinosors.iterator();
        Iterator<Watermelon> watermelonIterator = watermelons.iterator();

        while(dragonIterator.hasNext() || dinosorIterator.hasNext() || watermelonIterator.hasNext()) {
            triFunction.apply(dragonIterator.next(), dinosorIterator.next(), watermelonIterator.next());
        }

    }

    // Wrapper method to wrap the method call from different objects
    public String DoALotOfThings(Dragon dragon,
                               Dinosor dinosor,
                               Watermelon watermelon) {
        dragon.saySomething(dragon.getDragonName());
        String t = "";
        t = t + dinosor.saySomething();
        t = t + watermelon.saySomething();
        return t;
    }

    public static void main(String[] args) {

        RedMelony redMelony = new RedMelony();

        // Dragons

        ArrayList<Dragon> dragonList = new ArrayList<>();
        dragonList.add(new Dragon("Jade"));
        dragonList.add(new Dragon("Fire"));
        dragonList.add(new Dragon("Iron"));
        dragonList.add(new Dragon("Lightening - Fire"));
        dragonList.add(new Dragon("Wind"));
        dragonList.add(new Dragon("Water"));
        dragonList.add(new Dragon("Sand"));

        // Dinosors

        ArrayList<Dinosor> dinosors = new ArrayList<>();
        dinosors.add(new Dinosor("T-Rex"));
        dinosors.add(new Dinosor("Z-Rex"));
        dinosors.add(new Dinosor("Watermelon-Rex"));
        dinosors.add(new Dinosor("Banana-Rex"));
        dinosors.add(new Dinosor("Happy-T-Rex"));
        dinosors.add(new Dinosor("Sad-T-Rex"));
        dinosors.add(new Dinosor("Kiwi-Rex"));

        // Watermelons

        ArrayList<Watermelon> watermelons = new ArrayList<>();
        watermelons.add(new Watermelon("Square"));
        watermelons.add(new Watermelon("Round"));
        watermelons.add(new Watermelon("Ellipse"));
        watermelons.add(new Watermelon("Parabolic"));
        watermelons.add(new Watermelon("Cubic"));
        watermelons.add(new Watermelon("Pyramidal"));
        watermelons.add(new Watermelon("Spiral"));
        
        new RedMelony().doSomethingFun(dragonList, dinosors, watermelons, redMelony::DoALotOfThings);
    }
}   