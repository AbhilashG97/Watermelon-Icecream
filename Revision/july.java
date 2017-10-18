class may {
    void pussy(String name) {
        System.out.println("Who is THE pussy ?");
        System.out.println("Pussy.\nThis is Sparta.");
    }

    void king() {
        this.pussy("Ghutys");
        System.out.println("I am the blue eyed racoon-king");
    }
}

class july extends may {

    public static void main(String[] args) {
        july j = new july();
        j.pussy("Likjayk");
    }

    @Override
    void pussy(String name) {
        super.pussy("Jason");
        System.out.println("Yo.\nFear me, I am the pussy Lord.\n" + name);
    }
}