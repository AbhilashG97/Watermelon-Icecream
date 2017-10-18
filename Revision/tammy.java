class tummy {
    void say(String name) {
        System.out.println("This is who I am, and you cannot change that; so you are better off crying.\n- " + name);
    }
}

class tammy extends tummy {

    public static void main(String[] args) {
        tammy n = new tammy();
        n.say("Luvy");
    }

    @Override
    void say(String name) {
        super.say("Jack");
        System.out.println("This is not what I meant.\n- " + name);
    }
}