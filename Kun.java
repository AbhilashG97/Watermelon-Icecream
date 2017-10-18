interface Jack {
    public abstract void print();
}

class Rum implements Jack {
    public void print() {
        System.out.println("My name is Jack.");
    }
}

class Kun extends Rum {
    public static void main(String[] args) {
        jack r = new rum();
        r.print();
    }
}