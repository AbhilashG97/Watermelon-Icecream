interface kerei {
    void pretty();
}

class fax implements kerei {
    public void pretty(){
        System.out.println("This is a pretty picture.");
    }

    public static void main(String[] args){
        kerei k = new fax();
        k.pretty();
    }
}