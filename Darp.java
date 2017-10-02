import java.io.FileInputStream;
import java.io.IOException;

public class Darp {
	public static void main(String []args) throws IOException{
		try(FileInputStream fil = new FileInputStream("text.txt")){
			int i = 0;
			byte[] b = new byte[5];
			while((i=fil.read(b))!=-1){
				System.out.print(b);    
			}
		}
	}
}