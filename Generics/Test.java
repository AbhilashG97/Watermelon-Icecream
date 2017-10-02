import java.util.*;
import java.io.IOException;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		// MyGenericClass<String, Integer> mgc = new MyGenericClass<>("Jack", 123, 23);
		// System.out.println(mgc.getA()+" "+mgc.getB());
		// Float[] myArray = new Float[100];
		// mgc.addValues(myArray, 2, 200f);
		// System.out.println(myArray[2]);
		// RawClass raw = new RawClass(123);
		// RawClass<String> ripe = new RawClass<>("Yu Kun");
		// ripe.setVar("Yay ! Today's a holiday");
		// System.out.println(raw.getVar()+" "+ripe.getVar());
		// Bound b = new Bound(13);
		// System.out.println(b.isOdd());
		// Integer[] arr = {1, 2, 3, 4, 5, 6};
		// Doubt db = new Doubt();
		// Integer i = 3;
		// System.out.println(db.countGreaterThan(arr, i));
		List<Integer> list = Arrays.asList(1, 2, 3);
		// String[] a = new String[]{"Abhilash", "HimmelDreng", "Rurouni"};
		// System.out.println(list);
		// for(String elem : a){
		// 	System.out.print(elem+" ");
		// }
		//System.out.println();
		Integer[] c = new Integer[]{12, 23, 45};
		Double[] b = new Double[]{23.43d, 236783.230d, 232.098d};
		List l = Arrays.asList(b);
		// Mountain.gPrint(l);
		// List<Integer> l2 = Arrays.asList(c);
		// Mountain.addIntegersToList(l2, 5);
		Prac p = new Prac(){};
		Mountain m = new Mountain();
		m.wildCardError(list);
		System.out.println(list);

		//List<EvenNumber> list = new ArrayList<>();
		//List<? extends NaturalNumber> le = list;

		Mouse mouse = new Mouse(16002, "Abhilash G");
		mouse.printValues();

		//System.out.printf("My name is : %s ", "Yum");

		VarArgs va = new VarArgs(5);
		va.setNames("Ram", "Shyam", "Rurouni", "Kalilash", "Yuss", "Nooo");

		List<Integer> li = new ArrayList<>();
		List<?> ln = (List<?>) li;

	}
}