import java.io.*;

public class Active{

	public static void main(String[] args) throws Exception{
		Lazy l = new Lazy("sdas", 23);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.ser"));
		oos.writeObject(l);
		l.name = "asdasd";
		l.roll = 232323;
		oos.writeObject(l);
	}
} 