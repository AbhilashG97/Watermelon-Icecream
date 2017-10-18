class Utensil {
    public void msg() throws Exception {
        System.out.println("This is an fake Exception");
    }
}

public class Mug extends Utensil {
    public static void main(String[] args) throws Exception {
        Mug mg = new Mug();
        mg.msg();
    }

    public void msg() throws ArithmeticException {
        throw new ArithmeticException("Yo this is an Exception");
    }
}