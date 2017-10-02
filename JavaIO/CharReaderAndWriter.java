import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharReaderAndWriter {

	private FileReader fileReader;
	private FileWriter fileWriter;
	private int c;

	public CharReaderAndWriter(String inputFile , String outputFile) throws IOException{
		fileReader = new FileReader(inputFile);
		fileWriter = new FileWriter(outputFile);
		c = 0;
	}

	public void readAndWrite() throws IOException{
		while((c = fileReader.read())!=-1){
			fileWriter.write(c);
		}
	}

	public void printFile() throws IOException{
		while((c = fileReader.read())!= -1){
			System.out.println(c);
		}
	}

	public void closeAllReaders() throws IOException{
		fileReader.close();
		fileWriter.close();
	}

}