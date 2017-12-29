import java.util.*;

public class StudentList{

	private ArrayList<Student> studentList;

	public StudentList(Student student){
		studentList = new ArrayList<>();
		student.add(student);
	}

	public static void main(String[] args) {
		Student s = new Student("Jack", 123, "A");
		StudentList stl = new StudentList();
			
	}	

}