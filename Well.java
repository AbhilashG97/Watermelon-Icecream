class Dry {
    void m() {
        System.out.println("This is a dry well.");
    }
}

class Pond extends dry {
    void n() {
        System.out.println("This is a well.");
    }
}

class Well {
    public static void main(String[] args){
        pond a = new pond();
        a.n();
        a.m();
    }
}