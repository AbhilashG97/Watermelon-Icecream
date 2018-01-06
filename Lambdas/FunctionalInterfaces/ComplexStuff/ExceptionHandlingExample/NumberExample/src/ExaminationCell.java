import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExaminationCell {
	
	public List<Student> getSpecificStudents(List<Student> studentList, Predicate<Student> condition){
		List<Student> specificStudents = new ArrayList<>();
		for(Student student : studentList) {
			if(condition.test(student)) {
				specificStudents.add(student);
			}
		}
		return specificStudents;
	}
	
	public void printStudents(List<Student> students) {
		students.forEach(student -> System.out.println(student));
	}
}
