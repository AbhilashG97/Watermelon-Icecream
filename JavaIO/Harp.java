import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Harp {

	private String name;
	private int roll;

	public Harp(String name, int roll){
		this.name = name;
		this.roll = roll;
	}

	public static void main(String[] args) throws IOException {
		try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))){
			Harp hp = new Harp(bfr.readLine(), bfr.read());
			System.err.println("Error Stream");
			System.err.println(hp.name);
			System.out.println((char)System.in.read());
		}
	}
}