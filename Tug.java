public class Tug {

    public static void main(String[] args) throws IOException {
        Tug tg = new Tug();
        tg.m();
        System.out.println("La la la la");
    }

    public void m() throws IOException {
        throw new IOException("A fake exception. Handle me.");
    }
}