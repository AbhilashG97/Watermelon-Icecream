import java.io.*;
import java.util.Scanner;

public class Quick {
	public static void main(String[] args) throws Exception{
		try(Scanner s = new Scanner(System.in)){
			if(s.nextInt()<10){
				throw new RacoonException("Enter a value greater than 10");
			}else {
				System.out.println("Yay, no errors.");
			}
		}
	}
}
