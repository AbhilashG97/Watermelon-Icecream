public class CopyObj {
    private static String className;

    static {
        System.out.println("This is a static block.");
    }

    private String name;
    private int roll;

    public CopyObj(int roll, String name, String className) {
        this();
        this.roll = roll;
        this.className = className;
        this.name = name;
    }

    public CopyObj() {
        System.out.println("This is a default constructor.");
    }

    CopyObj(String name) {
        this.name = name;
        System.out.println(name);
    }

    static public void myName() {
        className = "S7";
    }

    public static void main(String[] args) {
        CopyObj obj = new CopyObj(123, "Kali", "S3");

        obj.display();
    }

    public void display() {
        System.out.println("name : " + name + " Roll : " + roll + " Class name : " + className);
    }

    public void yourName() {
        myName();
        className = "S8";
        myName();
    }
}