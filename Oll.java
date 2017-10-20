package mypack;

class oll {
    static void enter(){
        System.out.println("This is a static method.");
    }

    int jack(int x){
        return x*x*x;
    }
    public static void main(String[] args){
        oll.enter();
        oll  l = new oll();
        System.out.println("The cube of 5 is "+l.jack(5));
    }
};