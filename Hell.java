interface Jack {
    static String gif(String x) {
        System.out.println("This is a string.");
        return x;
    }

    void pimp();

    default String getName(String a) {
        return a;
    }
}

abstract class July implements Jack {
    @Override
    public void pimp() {
        System.out.println("That is a suspicious person. Be carefull.");
    }

    abstract void sam();
}

class Hell extends July {
    public static void main(String[] args) {
        Jack j = new Hell();
        Hell h = new Hell();
        System.out.println(jack.gif("Susan") + " is so beautiful.");
        j.pimp();
        System.out.println(j.getName("Lucy") + " ooks suspicious.");
        h.sam();
    }

    @Override
    void sam() {
        super.pimp();
        System.out.println("I am Sam. I am glad to have met you.");
    }
}