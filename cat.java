class jack {
    void nosy(){
        System.out.println("This is the parent class.");
    }
}

class cat extends jack {
    void nosy(){
        super.nosy();
        System.out.println("This is the child class");
    }

    public static void main(String[] args){
        jack j = new cat();
        j.nosy();
    }
}