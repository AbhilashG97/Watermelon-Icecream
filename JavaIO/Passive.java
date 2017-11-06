import java.io.*;

public class Passive {

	public static void main(String[] args) throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.ser"));
		Lazy read = (Lazy) ois.readObject();
		System.out.println(read.name + " " + read.roll);	
	}
}