class red {
    public void m(){
    System.out.println("This is red.");
    }
}

class green extends red {
    void n(){
    System.out.println("This is green.");
    green f = new green();
    f.m();
    }
}

class blue extends red {
    void f(int y) {
        System.out.println("This is blue and "+y);
    }
}

class white {
    public static void main(String []args){
        blue b = new blue();
        green g = new green();
        b.m();
        b.f(3);
        g.m();
        g.n();
    }
}