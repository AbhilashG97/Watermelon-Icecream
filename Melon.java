class Water {
    void talk() {
        System.out.println("This is how I look like I talk.");
    }
}

class Melon extends Water {
    public static void main(String[] args) {
        Melon a = new Melon();
        a.talk();
    }

    void talk() {
        System.out.println("Meow");
    }
}