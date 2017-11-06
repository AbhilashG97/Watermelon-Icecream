import java.io.*;

public class ReadFromUser {

	private FileInputStream readInput;
	private FileOutputStream writeOutput;
	private String userInput;

	public ReadFromUser(String inputFile, String outputFile) throws IOException{
		readInput = new FileInputStream(inputFile);
		writeOutput = new FileOutputStream(outputFile);
		userInput = null;
	}

	public ReadFromUser() throws IOException{
		// Default constructor
	}

	public void readFromUser() throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		userInput = bfr.readLine();
		bfr.close();
	}

	public void writeToFile() throws IOException{
		byte[] b = userInput.getBytes();
		writeOutput.write(b);
	}

	public void closeAll() throws IOException{
		readInput.close();
		writeOutput.close();
	}
}