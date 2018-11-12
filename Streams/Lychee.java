import java.util.stream.*;
import java.util.*;

public class Lychee {

    /**
     * 
     * @param a Stream of String
     * @return ArrayList<Integer>
     */
    public ArrayList<Integer> sortEvenNumbers(ArrayList<String> stringNumberList) {
        return stringNumberList
        .stream()
        .map((number) -> Integer.valueOf(number))
        .filter((number) -> number%2==0)
        .collect(Collectors.toCollection(ArrayList::new));
    } 

    /**
     * 
     * @param integerList A stream of integers
     * @return Stream<Integer>
     */
    public Stream<Integer> getOddIntegerStream(ArrayList<Integer> integerList) {
        return integerList.stream()
                          .filter((number) -> number%2!=0);
    }


    /**
     * 
     * @param integerList 
     * @return Optional<Stream>
     */
    public Optional<Integer> getMultiplesOfThreeOptional(ArrayList<Integer> integerList) {
        return integerList.stream().findAny();
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

        ArrayList<Integer> integerList = numberList.stream()
                                                   .map((number) -> Integer.valueOf(number))
                                                   .collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println("\nAnother set of even numbers are -\n");

        new Lychee().getOddIntegerStream(integerList)
                    .collect(Collectors.toCollection(ArrayList::new))
                    .forEach(System.out::println);
        // Fix this
        new Lychee().getMultiplesOfThreeOptional(integerList)
                    .stream()
                    .collect(Collectors.toCollection(ArrayList<Integer>::new))
                    .forEach(System.out::println);
                                            
        numberScanner.close();
        scanner.close();
    }

}