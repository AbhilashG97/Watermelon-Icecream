class Water {
    void talk(){
        System.out.println("This is how I look like I talk.");
    }
}

class Melon extends Water {
    void talk(){
        System.out.println("Meow");
    }

    public static void main(String[] args){
        Melon a = new Melon();
        a.talk();
    }
}
