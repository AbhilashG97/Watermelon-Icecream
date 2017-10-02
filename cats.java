class jack  {
    int a;
    String name;
    jack(int a, String name){
        this.a = a;
        this.name = name;
    }

    void nosy(){
        System.out.println("This is the super class.");
    }
}

class cat extends jack {
    
        cat(){
            this();
        }
        void nosy(){
        super.nosy();
        System.out.println("This is the child class.");
    }
     public static void main(String[] args){
        jack j = new cat();
        j.nosy();
    }
}