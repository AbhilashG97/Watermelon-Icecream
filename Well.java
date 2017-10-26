class Dry {
    void m() {
        System.out.println("This is a dry well.");
    }
}

class Pond extends Dry {
    void n() {
        System.out.println("This is a well.");
    }
}

class Well {
    public static void main(String[] args){
        Pond a = new Pond();
        a.n();
        a.m();
    }
}