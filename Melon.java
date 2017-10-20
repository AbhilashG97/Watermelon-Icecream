class water {
    void talk(){
        System.out.println("This is how I look like I talk.");
    }
}

class melon extends water {
    void talk(){
        System.out.println("Meow");
    }

    public static void main(String[] args){
        melon a = new melon();
        a.talk();
    }
}