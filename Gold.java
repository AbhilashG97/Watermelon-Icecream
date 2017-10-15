class Gold {
    int roll;
    String name;
    static String college = "Oxford";

    Gold(int roll, String name){
        this.roll = roll;
        this.name = name;
    }

    void display(){
        System.out.println(roll+" "+name+" "+college);
    }

    public static void main(String[] args){
        gold s1 = new Gold(123, "Julius"), s2 = new Gold(456, "Max");
        s1.display();
        s2.display();
    }
}