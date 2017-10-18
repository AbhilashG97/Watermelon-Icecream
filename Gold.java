class Gold {
    static String college = "Oxford";
    int roll;
    String name;

    Gold(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public static void main(String[] args) {
        Gold s1 = new Gold(123, "Julius"), s2 = new Gold(456, "Max");
        s1.display();
        s2.display();
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}