import java.util.*;

public class DoggyFruit {
    
    public static void main(String[] args) throws Exception{
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> myList = new ArrayList<>();

        map.put("Fruit", "Apple");
        map.put("Vanilla", "Flavour");
        map.put("Potato", "Vegetable");

        //map.forEach(System.out::println);
        myList.add("Watermelon");
        myList.add("Kiwi");
        myList.add("Dragon Fruit");
        myList.add("Jack fruit");
        
        myList.forEach(System.out::println);
    }   
}