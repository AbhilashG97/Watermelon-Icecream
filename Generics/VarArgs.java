import java.io.*;
import java.util.*;

public class VarArgs {
	
	private int numberOfStudents;

	public VarArgs(int numberOfStudents){
		this.numberOfStudents = numberOfStudents;
	}

	public VarArgs(){

	}

	public void setNames(String ...names) throws IOException{
		int i=0;
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		for(String n : names){
			System.out.print(n+" ");
		}
		System.out.println();	
		bfr.close();	
	}
}