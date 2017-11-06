import java.io.*;

public class Student implements Serializable{

	protected String name, branch, batch;
	protected int rollNumber;
	
	public Student(){
		this("John", "CSE", "A", 16001);
	}

	public Student(String name,
				   String branch,
				   String batch,
				   int rollNumber){	
		this.name = name;
		this. branch = branch;
		this.batch = batch;
		this.rollNumber = rollNumber;
	}

	public void setStudentName(String name, int rollNumber){
		this.name = name;
		this.rollNumber = rollNumber;
	}
}