class Jack {
    public void nosy(){
        System.out.println("This is the parent class.");
    }
}

public class Cat extends Jack {
    public void nosy(){
        super.nosy();
        System.out.println("This is the child class");
    }

    public static void main(String[] args){
        Jack j = new Cat();
        j.nosy();
    }
}