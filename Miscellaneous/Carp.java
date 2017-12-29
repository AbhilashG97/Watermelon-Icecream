import java.io.*;

public class Carp {

   public static void main(String[] args) throws IOException{
      try(FileOutputStream fos = new FileOutputStream("text.txt", true); 
      	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))){

         byte[] b = (bfr.readLine()).getBytes();
         fos.write(b);
      }
   }
}