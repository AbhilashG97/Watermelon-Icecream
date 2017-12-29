public class Student {

	private String name, batch;
	private String rollNumber;

	public Student(){
		//Default
	}

	public Student(String name, String batch, String rollNumber){
		this.name = name;
		this.batch = batch;
		this.rollNumber = rollNumber;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setRollNumber(String roll){
		rollNumber = roll;
	}

	public void setBatch(String batch){
		this.batch= batch;
	}

	public String getName(){
		return name;
	}

	public String getBatch(){
		return batch;
	}

	public String getRollNumber(){
		return rollNumber;
	}

}