class dry {
    void m() {
        System.out.println("This is a dry well.");
    }
}

class pond extends dry {
    void n() {
        System.out.println("This is a well.");
    }
}

class well {
    public static void main(String[] args){
        pond a = new pond();
        a.n();
        a.m();
    }
}