import names.packagePrac;

class naes {
    public static void main(String[] args){
        packagePrac n = new packagePrac();
        n.setName("Abhilash G");
        System.out.println("My name is "+n.getName());
        n.removeName();
        System.out.println("After removing the name: "+n.getName());
    }
}