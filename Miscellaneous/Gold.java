class Gold {
    private int rollNumber;
    private String name;
    private static String college = "Oxford";

    Gold(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }

    void display(){
        System.out.println(rollNumber+" "+name+" "+college);
    }

    public static void main(String[] args){
        Gold gold = new Gold(123, "Julius"), silver = new Gold(456, "Max");
        gold.display();
        silver.display();
    }
}
