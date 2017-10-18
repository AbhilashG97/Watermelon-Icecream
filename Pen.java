class Froyo {
    String cry = "BlueShift";

    void say() {
        System.out.println("Different humans.");
    }
}

class Pen extends Froyo {
    String cry = "RedShift";

    public static void main(String[] args) {
        Pen p = new Pen();
        p.say();
        p.yo();
    }

    void yo() {
        super.say();
    }

    void say() {
        System.out.println("Indiffernt clouds");
    }
}