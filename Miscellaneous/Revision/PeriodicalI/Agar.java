class Blue {
    Blue(){
        System.out.println("This is the parent class.");
    }
}

class Agar extends Blue {
    Agar(){
        super();
        System.out.println("This is the child class.");
    }

    public static void main(String []args){
        Agar a = new Agar();
    }
}