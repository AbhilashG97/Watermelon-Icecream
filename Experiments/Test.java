import java.io.*;

public class Test extends Student{

	public Test(){

	}

	public static void main(String[] args) throws Exception{
		Student s = new Student("Jack", "CSE", "A", 123);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.ser"));
		oos.writeObject(s);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.ser"));
		Student readStudent = (Student) ois.readObject();

		System.out.print(readStudent.name + " " +readStudent.branch);
	}
	
}
