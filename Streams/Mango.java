import java.util.stream.*;
import java.util.*;
import java.util.regex.Pattern;
import java.nio.file.*;
import java.io.*;

public class Mango {

    public Stream<String> getEmptyStream() {
        return Stream.empty();
    }

    public Stream<String> getStream(ArrayList<String> stringList) {
        return stringList == null || stringList.isEmpty() ? Stream.empty() : stringList.stream();  
    }

    public Stream<Integer> getStreamFromIntegerArray(Integer[] array) {
        return Arrays.stream(array);
    }

    public Stream<String> getStreamFromStringArray(String... array) {
        return Arrays.stream(array);
    }

    public Stream<Double> getStreamFromDoubleArray(Double[] array) {
        return Arrays.stream(array);
    }

    public Stream<String> someStream() {
        return Stream.of("w","a","t","e","r","m","e","l","o","n");
    }

    public IntStream getStreamOfChaarctersFromCharacterArray(char[] arr) {
        return IntStream.generate(() -> arr[0]).limit(10);
    }

    public IntStream getPrimitiveCharacterStream(char[] characterArray) {
        return IntStream.builder()
        .add(characterArray[0])
        .add(characterArray[1])
        .build();
    }

    public Stream<String> myStreamBuilder(String... args) {
        return Stream.<String>builder()
        .add(args[0])
        .add(args[1])
        .add(args[2])
        .build(); 
    }

    public Stream<String> generateStrings(int limit, String someString) {
        return Stream.generate(() -> someString).limit(limit);
    }

    public Stream<Integer> createStream(int initalValue, int limit) {
        return Stream.iterate(initalValue, n -> n+2)
                    .limit(limit);
    }
    
    public IntStream createRandomIntStream() {
        return new Random() .ints();
    }

    public IntStream createIntStream() {
        return IntStream.range(0, 100);
    }

    public IntStream createAnotherIntStream() {
        return IntStream.rangeClosed(0, 100);
    }

    public DoubleStream createDoubleStream() {
        return new Random().doubles();
    }

    public LongStream createLongStream() {
        return new Random().longs();
    }

    public LongStream createAnotherLongStream() {
        return LongStream.range(0, 100);
    }

    public LongStream createAnotherClosedLongStream() {
        return LongStream.rangeClosed(0, 100);
    }

    public IntStream getCharacterStream(String stringInput) {
        return stringInput.chars();
    }

    public Stream<String> getAnotherCharacterStream(String someString) {
        return Pattern.compile(",")
                      .splitAsStream(someString);
    } 
     
    public Stream<String> readASimpleRecipeFile() throws IOException {
        return Files.lines(Paths.get("recipe.txt"));
    }

    public IntStream getPrimitiveIntegerStream(int[] intArray) {
        return IntStream.of(intArray);
    }

    public Stream<Character> getStreamOfCharacter(Character[] characterArray) {
        return Stream.<Character>builder()
        .add(characterArray[0])
        .add(characterArray[1])
        .build();
    }

    public static void main(String[] args) {
        Mango mango = new Mango();
        System.out.println(mango.someStream().toString());
        
        Scanner scanner = new Scanner(System.in);
        // mango.myStreamBuilder(scanner.nextLine().split(" "));

        // mango.getStreamFromStringArray(scanner.nextLine().split(" "));

        // mango.getStreamOfChaarctersFromCharacterArray(scanner.nextLine().toCharArray());

        // mango.getPrimitiveCharacterStream(scanner.nextLine().toCharArray());

        mango.getPrimitiveIntegerStream(new int[]{12, 23, 121, 100});

        mango.getStreamOfCharacter(new Character[]{'a', 'b', 'c', 'z', 'f'});

        scanner.close();
    }
}