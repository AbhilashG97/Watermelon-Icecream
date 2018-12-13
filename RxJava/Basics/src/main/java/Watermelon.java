import io.reactivex.*;
import java.util.Scanner;

public class Watermelon {

    public Observable<String> getTypedObservable(String input) {
        return Observable.just(input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder result = new StringBuilder("");

        String userInput = scanner.nextLine();
        new Watermelon().getTypedObservable(userInput)
                        .subscribe((string) -> {
                            result.append(string);
                        });
        System.out.println("The result is :"+ result.toString());
        scanner.close();
    }
}