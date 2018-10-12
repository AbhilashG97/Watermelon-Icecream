import java.io.*;
import java.util.Vector;

public class July{

    public static void main(String[] args) throws Exception{
        FileInputStream file1 = new FileInputStream("Test1.txt");
        FileInputStream file2 = new FileInputStream("Test2.txt");
        FileInputStream file3 = new FileInputStream("readMe.txt ");

        Vector<FileInputStream> stream = new Vector<>();
        stream.add(file1);
        stream.add(file2);
        stream.add(file3);

        FileOutputStream output = new FileOutputStream("output.txt");
        SequenceInputStream files = new SequenceInputStream(stream.elements());
        int j;
        while((j = files.read())!=-1){
            System.out.print((char)j);
            output.write(j);
        }

        FileWriter writer = new FileWriter("yum.txt");
        writer.write("Watermelon is a tasty fruit");

        FileReader reader = new FileReader("yum.txt");
        int h;
        while((h = reader.read())!= -1){
            System.out.print((char)h);
        }

    }
}