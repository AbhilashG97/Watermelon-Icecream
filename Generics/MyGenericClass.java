import java.io.*;
import java.util.Scanner;

public class MyGenericClass<A, B> {
	private A a;
	private B b;
	private A[] arr;
	public MyGenericClass(A a, B b, int size){
		this.a = a;
		this.b = b;
		arr = (A[]) new Object[size];
	}

	public void setArray(A data, int pos){
		arr[pos] = data;
	}

	/**@param position 
	  *	
	  */

	public <T extends Number> void addValues(T[] array, int position, T value){
		array[position] = value;
	}

	public A getA(){
		return a;
	}

	public B getB(){
		return b;
	}
}