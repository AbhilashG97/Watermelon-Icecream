import java.util.function.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Noble {

    public static void main(String[] args) {
        
        Supplier<ArrayList<Integer>> supplier = () -> new ArrayList<Integer>();
        
        ArrayList<Integer> myList = supplier.get();
        myList.addAll(Arrays.asList(12, 34, 54, 655, 100));
        System.out.println(myList);

    }    
}