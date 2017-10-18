public class Mountain {

    public static void gPrint(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
    }

    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void addIntgersToList(List<? super Integer> list, int numberOfElments) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < numberOfElments; i++) {
            list.add(s.nextInt());
        }
        s.close();
    }

    public static void wildCardError(List<?> list) {
        wildCardErrorHelper(list);
    }

    private static <T> void wildCardErrorHelper(List<T> list) {
        list.set(0, list.get(0));
    }

    public void addElementsToList(List<? super Integer> list, int numberOfElments) {
        for (int i = 0; i < numberOfElments; i++) {
            try (Scanner s = new Scanner(System.in)) {
                list.add(s.nextInt());
            }
        }
    }

}