class blue {
    blue(){
        System.out.println("This is the parent class.");
    }
}

class agar extends blue {
    agar(){
        super();
        System.out.println("This is the child class.");
    }

    public static void main(String []args){
        agar a = new agar();
    }
}