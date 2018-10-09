package mypack;

class Oll {
    static void enter(){
        System.out.println("This is a static method.");
    }

    int jack(int x){
        return x*x*x;
    }
    public static void main(String[] args){
        args.enter();
        Oll  l = new Oll();
        System.out.println("The cube of 5 is "+l.jack(5));
    }
};