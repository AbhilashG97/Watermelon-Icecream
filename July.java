class Jam {
    int marks = 45;
}

class July extends jam {
    int marks = 100;

    public static void main(String[] args) {
        Jam j = new July();
        System.out.println("This is my marks : " + j.marks);
    }
}