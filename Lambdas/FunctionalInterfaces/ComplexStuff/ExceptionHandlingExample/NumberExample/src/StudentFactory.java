import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentFactory {
	
	private final int NUMBER_OF_STUDENTS=10;
	private static int count = 1;
	private Scanner scanner;
	
	public List<Student> getStudents(){
		List<Student> studentList = new ArrayList<>();
		
		for(int i=0; i<=NUMBER_OF_STUDENTS; i++) {
			studentList.add(getStudent());
			count++;
		}
		scanner.close();
		return studentList;
	}
	
	public Student getStudent() {
		scanner = new Scanner(System.in);
		return new Student("Student FN"+count, "Student LN"+count, new Address("Street"+count,
																	   			"City"+count,
																	   			"State"+count,
																	   			count),
																	   						 5+count);
	}
	
}
