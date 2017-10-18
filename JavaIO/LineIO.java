public class LineIO {

    private BufferedReader bfr = null;
    private PrintWriter pw = null;
    private String l;

    public LineIO(String in, String out) throws IOException {
        bfr = new BufferedReader(new FileReader(in));
        pw = new PrintWriter(new FileWriter(out));
        l = null;
    }

    public void readFile() throws IOException {
        while ((l = bfr.readLine()) != null) {
            pw.println(l);
        }
    }

    public void viewFile() throws IOException {
        while ((l = bfr.readLine()) != null) {
            System.out.println(l);
        }
    }

    public void closeAllReaders() throws IOException {
        bfr.close();
        pw.close();
    }

}