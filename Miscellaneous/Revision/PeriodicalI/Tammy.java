class Tummy {
    void say(String name){
        System.out.println("This is who I am, and you cannot change that; so you are better off crying.\n- "+name);
    }
}

class Tammy extends Tummy{
    
    @Override
    void say(String name){
        super.say("Jack");
        System.out.println("This is not what I meant.\n- "+name);
    }

    public static void main(String []args){
        Tammy n = new Tammy();
        n.say("Luvy");
    }
}