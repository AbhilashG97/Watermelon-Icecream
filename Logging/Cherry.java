import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;
import java.util.stream.*;
import java.util.ArrayList;

public class Cherry {

    private final static Logger logger = Logger.getLogger(Cherry.class.getName());

    public ArrayList<Integer> getEvenNumbers(ArrayList<String> integerNumbers) {
        logger.info("Stream of integers");
        return integerNumbers.stream()
                             .map((number) -> Integer.valueOf(number))
                             .filter((number) -> number%2==0)
                             .collect(Collectors.toCollection(ArrayList<Integer>::new));
    }

    public static void main(String[] args) {
        ArrayList<String> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        Scanner userScanner = new Scanner(userInput);
        userScanner.useDelimiter(" ");

        while(userScanner.hasNext()) {
            integerList.add(userScanner.next());
        }

        new Cherry().getEvenNumbers(integerList)
                    .forEach(System.out::println);
        scanner.close();
        userScanner.close();
    }    
}