import java.util.ArrayList;

public class Candy<E> {

	E[] e;

	@SuppressWarnings("unchecked")
	public <U> Candy(int size, U u){
		e = (E[]) new Object[size];
		System.out.println(u);
	}

	ArrayList<String> arr = new ArrayList<>();
	ArrayList arrList = arr;

	public static <E> void printSomething(E e){
		System.out.println(e);
	}

	public <E extends Number> void myName(){
		//Do Something
	} 

	public static void main(String[] args) {
		Candy.printSomething(25);
	}

}