public class Student implements Comparable<Student>{

	private String name, batch;
	private int rollNumber;

	pubilc Student(){
		//Default constructor
	}

	public Student(String name, int rollNumber, String batch){
		this.name = name;
		this.rollNumber = rollNumber;
		this.batch = batch;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setRollNumber(int rollNumber){
		this.rollNumber = rollNumber;
	}

	public void setBatch(String batch){
		this.batch = batch;
	}

	public int compareTo(Student student){

		if(rollNumber == student.rollNumber){
			return 0;
		}else if( rollNumber > student.rollNumber){
			return 1;
		}else{
			return -1;
		}

	}
}