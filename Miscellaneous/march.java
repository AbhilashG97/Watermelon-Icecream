class May {

    void month(){
        System.out.println("This is the month of May.");
    }
}

class June extends May {
    void month(){
        System.out.println("This is the month of June.");
    }
}

class March extends May{
    void month(){
        System.out.println("This is the month of March.");
    }

    public static void main(String[] args){
        may m = new may();
        may n = new june();
        may u = new march();
        m.month();
        n.month();
        u.month();
    }
}