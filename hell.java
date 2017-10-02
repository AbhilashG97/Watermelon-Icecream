interface jack {
    void pimp();

    static String gif(String x){
        System.out.println("This is a string.");
        return x;
    }

    default String getName(String a){
        return a;
    }
}

abstract class july implements jack {
    @Override 
    public void pimp(){
        System.out.println("That is a suspicious person. Be carefull.");
    }

    abstract void sam();
}

class hell extends july {
    @Override
    void sam(){
        super.pimp();
        System.out.println("I am Sam. I am glad to have met you.");
    }
    public static void main(String[] args){
        jack j = new hell();
        hell h = new hell();
        System.out.println(jack.gif("Susan") + " is so beautiful.");
        j.pimp();
        System.out.println(j.getName("Lucy")+" ooks suspicious.");
        h.sam();
    }
}