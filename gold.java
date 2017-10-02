class gold {
    int roll;
    String name;
    static String college = "Oxford";

    gold(int roll, String name){
        this.roll = roll;
        this.name = name;
    }

    void display(){
        System.out.println(roll+" "+name+" "+college);
    }

    public static void main(String[] args){
        gold s1 = new gold(123, "Julius"), s2 = new gold(456, "Max");
        s1.display();
        s2.display();
    }
}