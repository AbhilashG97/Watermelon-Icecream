import java.io.*;

public class Jarp {
	public static void main(String[] args) throws IOException{
		try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))){
			String name = bfr.readLine();
			assert "Password".equals(name) : "Incorrect Password";
		}
	}
}