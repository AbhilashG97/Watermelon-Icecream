
import java.util.*;

public class More {
    
    public More() {
        super();
    }
    
    public static void gPrint(List list) {
        for (/*synthetic*/ Iterator i$ = list.iterator(); i$.hasNext(); ) {
            Number n = (Number)i$.next();
            {
                System.out.print(n + " ");
            }
        }
    }
    
    public static void printList(List list) {
        for (/*synthetic*/ Iterator i$ = list.iterator(); i$.hasNext(); ) {
            Object elem = (Object)i$.next();
            {
                System.out.print(elem + " ");
            }
        }
        System.out.println();
    }
    
    public void addElementsToList(List list, int numberOfElments) {
        for (int i = 0; i < numberOfElments; i++) {
            {
                final Scanner s = new Scanner(System.in);
                /*synthetic*/ Throwable primaryException0$ = null;
                try {
                    list.add(Integer.valueOf(s.nextInt()));
                } catch (/*synthetic*/ final Throwable t$) {
                    primaryException0$ = t$;
                    throw t$;
                } finally {
                    if (s != null) if (primaryException0$ != null) try {
                        s.close();
                    } catch (/*synthetic*/ Throwable x2) {
                        primaryException0$.addSuppressed(x2);
                    } else s.close();
                }
            }
        }
    }
    
    public static void addIntgersToList(List list, int numberOfElments) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < numberOfElments; i++) {
            list.add(Integer.valueOf(s.nextInt()));
        }
        s.close();
    }
    
    public static void wildCardError(List list) {
        wildCardErrorHelper(list);
    }
    
    private static void wildCardErrorHelper(List list) {
        list.set(0, list.get(0));
    }
}
