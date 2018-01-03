class Jack {
    private int a;
    private String name;
    
    Jack(int a, String name){
        this.a = a;
        this.name = name;
    }

    Jack(){
        a = 0;
        name = null;
    }

    void nosy(){
        System.out.println("This is the super class.");
    }
}

public class Cats extends Jack {
    
        public Cats(){
            super(25, "Jack");
        }

        void nosy(){
            super.nosy();
            System.out.println("This is the child class.");
        }

     public static void main(String[] args){
        Jack j = new Cats();
        j.nosy();
    }
}
