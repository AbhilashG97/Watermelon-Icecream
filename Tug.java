import java.io.*;

public class Tug{
	
	public void m() throws IOException {
		throw new IOException ("A fake exception. Handle me.");
	}

	public static void main(String[] args) throws IOException {
		Tug tg = new Tug();
		tg.m();
		System.out.println("La la la la");
	}
}