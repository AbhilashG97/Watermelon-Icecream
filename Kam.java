class Gun {
    void yell() {
        System.out.println("This is a random set of string.");
    }
}


class Pistol extends Gun {
    void yell() {
        System.out.println("This is a random string about a pistol.");
    }
}

class Kam extends Pistol {
    public static void main(String[] args) {
        Gun g = new Kam();
        g.yell();
    }
}