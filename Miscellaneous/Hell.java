interface Jack {
    void pimp();

    static String gif(String x){
        System.out.println("This is a string.");
        return x;
    }

    default String getName(String a){
        return a;
    }
}

abstract class July implements Jack {
    @Override 
    public void pimp(){
        System.out.println("That is a suspicious person. Be carefull.");
    }

    abstract void sam();
}

class Hell extends July {
    @Override
    void sam(){
        super.pimp();
        System.out.println("I am Sam. I am glad to have met you.");
    }
    public static void main(String[] args){
        Jack jack = new Hell();
        Hell hell = new Hell();
        System.out.println(jack.gif("Susan") + " is so beautiful.");
        jack.pimp();
        System.out.println(j.getName("Lucy")+" ooks suspicious.");
        hell.sam();
    }
}
