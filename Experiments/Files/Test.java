import java.io.*;


public class Test {

	public void writeToFile() throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name");
		String name = bfr.readLine();
		FileWriter writer = new FileWriter("Student.txt");
		writer.write(name);
		System.out.println("Batch");
		String batch = bfr.readLine();
		batch += ",";
		writer.write(batch);
		System.out.println("Roll");
		String roll = bfr.readLine();
		roll += ","; 
		writer.write(roll);
	}

	public void readFromFile(String fileName){
		
	}

}