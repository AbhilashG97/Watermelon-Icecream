public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        // ReadAndWrite rw = new ReadAndWrite(bfr.readLine(), bfr.readLine());
        // rw.readWriteFile();
        // rw.printWrittenFile();
        // rw.closeReaders();
        // CharReaderAndWriter crw = new CharReaderAndWriter(bfr.readLine(), bfr.readLine());
        // crw.readAndWrite();
        // crw.printFile();
        // bfr.close();
        // crw.closeAllReaders();
        // LineIO line = new LineIO(bfr.readLine(), bfr.readLine());
        // line.readFile();
        // line.viewFile();
        // line.closeAllReaders();
        // MyProg mp = new MyProg("myOutputFile.txt");
        // mp.readStringInput();
        // mp.showFile();

        // Prac p = new Prac(bfr.readLine(), bfr.readLine());
        // p.calculate();
        // System.out.printf("%d", p.getMax());

        // Watermelon w = new Watermelon();
        // w.calculate();

        // ReadInput ri = new ReadInput(bfr.readLine());
        // ri.readData();

        // ReadFromUser rfu = new ReadFromUser("poltergeist.txt", "ghost.txt");
        // rfu.readFromUser();
        // rfu.writeToFile();
        // rfu.closeAll();

        ReadFromUserChar rfuc = new ReadFromUserChar();
        rfuc.readFromUser();
        rfuc.writeToFile();
        rfuc.readAndWriteFromFile();
        rfuc.closeAll();
    }
}