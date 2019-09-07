class Water {
    void talk(){
        System.out.println("This is how I look like I talk.");
    }
}

class TalkativeMelon extends Water {
    void talk(){
        System.out.println("Meow");
    }

    public static void main(String[] args){
        TalkativeMelon a = new TalkativeMelon();
        a.talk();
    }
}