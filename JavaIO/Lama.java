import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lama {

    public static void main(String[] args) {

        try {
            //create FileOutputStream object
      /*
       * To create DataOutputStream object from FileOutputStream use,
       * DataOutputStream(OutputStream os) constructor.
       *
       */

            DataOutputStream dos = new DataOutputStream(new FileOutputStream("mama.txt"));

            int i = 100;
     
       /*
        * To write an int value to a file, use
        * void writeInt(int i) method of Java DataOutputStream class.
        *
        * This method writes specified int to output stream as 4 bytes value.
        */

            dos.writeInt((int) i);
       
        /*
         * To close DataOutputStream use,
         * void close() method.
         *
         */

            dos.close();

        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }

    }
}