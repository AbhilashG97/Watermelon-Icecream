class smallfry{
    void m(){
        System.out.println("I am a small fry.");
    }
}

class bigfry extends smallfry {
    void n() {
        System.out.println("I am a big fry.");
    }
}

class uglyfry extends bigfry {
    void a(){
    System.out.println("I am an ugly fry.");
    }
}

class fry{
    public static void main(String args[]){
        uglyfry f = new uglyfry();
        f.n();
        f.m();
        f.a();
    }
}
