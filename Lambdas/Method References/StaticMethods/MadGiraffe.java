import java.util.function.BiFunction;

class Multiplication {
    public static int multiply(int a, int b) {
        return a*b;
    }    
}

public class MadGiraffe {

    public int doSomething(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public static void main(String[] args) {
        System.out.println(new MadGiraffe().doSomething(5, 6, Multiplication::multiply));
    }
}       