import java.util.Scanner;

interface Test {

    default void myName(String name) {
        System.out.println("My name is : " + name);
    }

    void cake(String cakeName);

    void number(int num);
}

public class Poppy implements Test {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

            Poppy p = new Poppy();
            p.myName(s.nextLine());
            p.number(s.nextInt());
            p.cake(s.nextLine());
        }

    }

    public void cake(String cakeName) {
        System.out.println("Cake : " + cakeName);
    }

    public void number(int num) {
        System.out.println("Number : " + num);
    }

}