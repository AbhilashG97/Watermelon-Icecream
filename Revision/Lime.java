import java.io.*;

interface Mango {

	default void displayName(String name){
		System.out.println("Name : "+name);
	}

	void showInt(String num);
}

interface Banana extends Mango {

	@Override
	void displayName(String name);
} 

public class Lime implements Banana{

	public void displayName(String name){
		System.out.println("The typed name is : "+name);
	}

	public void showInt(String num){
		int i = Integer.parseInt(num);
		System.out.println("The integer typed is : "+i);
	}

	public static void main(String[] args) throws IOException{
		try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))){
			Lime l = new Lime();
			l.displayName(bfr.readLine());
			l.showInt(bfr.readLine());
		}
	}
}