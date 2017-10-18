interface Jill {
    String getName();

    int getRoll();

    String getBranch();
}

abstract class Jack implements Jill {

    protected String name;
    protected int roll;
    protected String branch;

    public Jack(String name, String branch, int roll) {
        this.name = name;
        this.branch = branch;
        this.roll = roll;
    }

    public String getBranch() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }
}

public class Tappy extends Jack {

    public static void main(String[] args) {
        Tappy j = new Jack("Jummy", "CSE", 16999);
        System.out.println(j.getName());
    }

    public String getBranch() {
        System.out.println("Branch : ");
        return name;
    }

    public int getRoll() {
        System.out.println("Roll : ");
        return roll;
    }
}