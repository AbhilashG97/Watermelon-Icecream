import java.util.stream.*;
import java.util.*;

public class Lychee {

    public ArrayList<Integer> sortEvenNumbers(ArrayList<String> stringNumberList) {
        return stringNumberList
        .stream()
        .map((number) -> Integer.valueOf(number))
        .filter((number) -> number%2==0)
        .collect(Collectors.toCollection(ArrayList::new));
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter space separated numbers");
        ArrayList<String> numberList = new ArrayList<>();

        String inputString = scanner.nextLine();

        Scanner numberScanner = new Scanner(inputString).useDelimiter(" ");
        while(numberScanner.hasNext()) {
            numberList.add(numberScanner.next());
        }

        System.out.println("\nEven numbers after sorting are :-\n");
        new Lychee().sortEvenNumbers(numberList).forEach(System.out::println);;

        numberScanner.close();
        scanner.close();
    }

}