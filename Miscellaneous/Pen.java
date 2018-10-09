class Froyo {
    String cry = "BlueShift";

    void say(){
        System.out.println("Different humans.");
    }   
}

class Pen extends Froyo {
    String cry = "RedShift";
    void yo(){
    super.say();
    }
    void say() {
        System.out.println("Indiffernt clouds");
    }

    public static void main(String[] args){
        Pen p = new pen();
        p.say();
        p.yo();
    }
}