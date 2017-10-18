public class ReadInput {

    private FileOutputStream out;
    private String readString;

    public ReadInput(String outputFile) throws IOException {
        readString = null;
        out = new FileOutputStream(outputFile);
    }

    public void readData() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        readString = in.readLine();
        byte[] b = readString.getBytes();
        out.write(b);
        in.close();
    }
}