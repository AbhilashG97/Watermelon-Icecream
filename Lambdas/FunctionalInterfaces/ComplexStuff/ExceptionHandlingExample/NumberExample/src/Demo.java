import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		StudentFactory studentFactory = new StudentFactory();
		ExaminationCell examinationCell = new ExaminationCell();
		List<Student> students = studentFactory.getStudents();
		List<Student> specificStudents = examinationCell.getSpecificStudents(students, student -> student.getSGPA()>9);
		examinationCell.printStudents(specificStudents);
	}

}
