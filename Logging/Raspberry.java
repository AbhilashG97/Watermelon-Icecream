import java.util.logging.*;
import java.io.*;

class WatermelonException extends IOException {
    public WatermelonException(String message) {
        super(message);
    }
}

public class Raspberry {

    private final static String className = Raspberry.class.getName();

    private final static Logger logger = Logger.getLogger(className);

    public Raspberry() {
        logger.setLevel(Level.FINER);
        logger.addHandler(new ConsoleHandler());
    }

    public void sayWatermelon() {
        logger.entering(className, "sayWatermelon");
        System.out.println("Watermelon!");
        logger.log(Level.SEVERE, "Muahahahaha!!");
        logger.exiting(className, "sayWatermelon");
    }

    public void sayMango() {
        logger.severe("This is a severe mango");
        System.out.println("Mango!");
    }

    public void sayCherry() {
        logger.log(Level.INFO, "Sweet cherry");
        System.out.println("Cherry!");
    }

    public static void main(String[] args) {
        new Raspberry().sayWatermelon();
        new Raspberry().sayCherry();
        new Raspberry().sayMango();
    }
}