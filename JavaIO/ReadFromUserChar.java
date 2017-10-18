public class ReadFromUserChar extends ReadFromUser {

    private FileReader readInput;
    private FileWriter writeOutput;
    private String userInput;

    public ReadFromUserChar() throws IOException {
        readInput = new FileReader("ghost.txt");
        writeOutput = new FileWriter("poltergeist.txt", true);
        userInput = null;
    }

    public void readFromUser() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        userInput = bfr.readLine();
        bfr.close();
    }

    @Override
    public void writeToFile() throws IOException {
        writeOutput.write(userInput);
    }

    public void readAndWriteFromFile() throws IOException {
        int c = 0;
        while ((c = readInput.read()) != -1) {
            writeOutput.write(c);
        }
    }

    public void closeAll() throws IOException {
        readInput.close();
        writeOutput.close();
    }

}