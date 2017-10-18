class May {

    void month() {
        System.out.println("This is the month of May.");
    }
}

class June extends May {
    void month() {
        System.out.println("This is the month of June.");
    }
}

class march extends May {
    public static void main(String[] args) {
        May m = new May();
        May n = new June();
        May u = new March();
        m.month();
        n.month();
        u.month();
    }

    void month() {
        System.out.println("This is the month of March.");
    }
}