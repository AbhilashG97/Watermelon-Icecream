public class Ghost {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        System.out.println(li.getClass() == ls.getClass());
        // It prints true, because at runtime both of them return
        // the same class due to tyoe erasure
    }
}