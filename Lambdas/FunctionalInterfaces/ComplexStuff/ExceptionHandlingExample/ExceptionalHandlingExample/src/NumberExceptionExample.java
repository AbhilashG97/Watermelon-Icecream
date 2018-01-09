import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class NumberExceptionExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		Arrays.fill(arr, new Random().nextInt(100));
		int key = scanner.nextInt();
		process(arr, key, wrapperLambda((arrValue, keyValue) -> System.out.println(arrValue/keyValue)));
		scanner.close();
	}

	private static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer){
		for(int i : arr) {
			consumer.accept(i, key);
		}
	}
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return (arrValue, keyValue) -> {
			try {
				consumer.accept(arrValue, keyValue);
			}catch(ArithmeticException ae) {
				System.out.println("Meow, why did you enter 0 !");
			}
		};
	}
}
