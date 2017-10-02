interface jack {
    public abstract void print();
}

class rum implements jack {
     public void print(){
        System.out.println("My name is Jack.");
    }
}

class kun extends rum{
    public static void main(String []args){
        jack r = new rum();
        r.print();
    }
}