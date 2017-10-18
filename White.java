class Red {
    public void m() {
        System.out.println("This is red.");
    }
}

class Green extends Red {
    void n() {
        System.out.println("This is green.");
        Green f = new Green();
        f.m();
    }
}

class Blue extends Red {
    void f(int y) {
        System.out.println("This is blue and " + y);
    }
}

class white {
    public static void main(String[] args) {
        Blue b = new Blue();
        Green g = new Green();
        b.m();
        b.f(3);
        g.m();
        g.n();
    }
}