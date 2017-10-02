import java.io.*;
import java.util.Scanner;

public class Grand {
	private int num;

	Grand(int num){
		this.num = num;
	}

	public void m(){
		throw new ArithmeticException("Incorrect Input");
	}

	public void s(){
		this.m();
	}

	public static void main(String[] args){
		try(Scanner s = new Scanner(System.in)){
			Grand d = new Grand(s.nextInt());
			try{
				d.m();
			}catch (Exception e){
				System.out.println("Something went wrong");
				System.exit(0);
			}
		}
	}
}