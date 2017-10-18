interface Kerei {
    void pretty();
}

class Fax implements Kerei {
    public static void main(String[] args) {
        Kerei k = new Fax();
        k.pretty();
    }

    public void pretty() {
        System.out.println("This is a pretty picture.");
    }
}