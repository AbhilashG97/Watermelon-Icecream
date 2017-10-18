import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {

    private FileInputStream in;
    private FileOutputStream out;
    private int c;

    public ReadAndWrite(String inputFile, String outputFile) throws IOException {
        in = new FileInputStream(inputFile);
        out = new FileOutputStream(outputFile);
        c = 0;
    }

    public void readWriteFile() throws IOException {
        while ((c = in.read()) != -1) {
            out.write(c);
        }
    }

    public void printWrittenFile() throws IOException {
        c = 0;
        while ((c = in.read()) != -1) {
            System.out.print(c);
        }
    }

    public void closeReaders() throws IOException {
        in.close();
        out.close();
    }
}