import java.util.*;
import java.io.*;

public class Watermelon {

	private Scanner s;
	private FileOutputStream fos = null; 
	private ArrayList<Integer> list;
	private DataOutputStream dos = null;
	int i;

	public Watermelon()throws Exception{
		s = new Scanner(new File("zamafu.txt"));
		list = new ArrayList<>();
		fos = new FileOutputStream("famasu.txt");
		i=0;
		dos = new DataOutputStream(new FileOutputStream("damasu.txt"));
	}

	public void calculate() throws Exception{
		while(s.hasNextInt()) {
     		list.add(s.nextInt());
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		//int mami = list.get(list.size()-1);
		Integer jk = new Integer(420);
		Writer wr = new FileWriter("jangali.txt");
		wr.write(jk.toString());
		
		// int flipflop = 45;
		// dos.writeInt(flipflop);
		//fos.write(mami);
	}
} 