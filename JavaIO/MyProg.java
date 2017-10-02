import java.io.*;
import java.util.Scanner;

public class MyProg {

	private BufferedReader userInput = null, in = null; 
	private PrintWriter out = null;
	private String value;
	private Scanner s;

	public MyProg(String outputFile) throws IOException{
		userInput = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(new FileWriter(outputFile));
		in = new BufferedReader(new FileReader(outputFile));
		value = null;
		s = new Scanner(System.in);
	}

	public void readStringInput() throws IOException{
		while(int i=0){
			out.println(value);
		}
	}

	public void showFile() throws IOException{
		String temp;
		while((temp = s.nextLine())!=null){
			System.out.print(temp);
		}
	}

}