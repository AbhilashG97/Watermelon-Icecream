class June {
    June(){
        this(5);
        System.out.println("This is the first constructor.");
    }

    June(int x){
        System.out.println("This is a second constructor. And the number that was entered is "+x);
    }

    void apple(){
        System.out.println("This is an apple.");
    }

    void favFruit(String fName){
        this.apple();
        System.out.println("This is my favorite fruit :"+fName);
    }

    public static void main(String args[]){
        June n = new june();
        n.favFruit("Banana");
    }
}
