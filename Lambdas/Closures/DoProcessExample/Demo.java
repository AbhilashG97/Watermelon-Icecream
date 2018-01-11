import java.util.Scanner;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // This integer is effectively final 
        int someInteger = new Random().nextInt(15);

        ProcessExample processExample = new ProcessExample();
        processExample.doProcess(scanner.nextInt(), integer -> System.out.println(integer+someInteger));
        scanner.close();   
    }
}