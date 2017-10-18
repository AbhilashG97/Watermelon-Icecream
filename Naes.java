import names.packagePrac;

class Naes {
    public static void main(String[] args) {
        PackagePrac n = new PackagePrac();
        n.setName("Abhilash G");
        System.out.println("My name is " + n.getName());
        n.removeName();
        System.out.println("After removing the name: " + n.getName());
    }
}