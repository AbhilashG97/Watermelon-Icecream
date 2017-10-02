interface jilk {
    void pull();
    default void say(){
        System.out.println("There is a saying in English.");
    }
}

class kam implements jilk {
    public void pull(){
        System.out.println("This is a print statement.");
    }

    @Override
    public void say(){
        System.out.println("There used to be a saying in English.");
    } 
}   
class kall extends kam {
    public static void main(String[] args){
        kam k = new kall();
        k.say();
        k.pull();
    }
}