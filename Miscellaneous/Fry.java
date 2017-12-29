class Smallfry{
    void m(){
        System.out.println("I am a small fry.");
    }
}

class Bigfry extends Smallfry {
    void n() {
        System.out.println("I am a big fry.");
    }
}

class Uglyfry extends Bigfry {
    void a(){
    System.out.println("I am an ugly fry.");
    }
}

class Fry{
    public static void main(String args[]){
        Uglyfry f = new Uglyfry();
        f.n();
        f.m();
        f.a();
    }
}
