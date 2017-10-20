class froyo {
    String cry = "BlueShift";

    void say(){
        System.out.println("Different humans.");
    }   
}

class pen extends froyo {
    String cry = "RedShift";
    void yo(){
    super.say();
    }
    void say() {
        System.out.println("Indiffernt clouds");
    }

    public static void main(String[] args){
        pen p = new pen();
        p.say();
        p.yo();
    }
}