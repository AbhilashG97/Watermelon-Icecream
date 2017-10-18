public class TimeOut {

    public static <E> void append(List<E> list, Class<E> myClass) throws Exception {
        E elem = myClass.newInstance();
        list.add(elem);
    }
}