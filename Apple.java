class Jack{
    String name;
    int roll;
    void insertVal(String name, int roll){
    this.name = name;
    this.roll = roll;
}
}
class Apple{
    public static void main(String[] args) {
        Jack ja = new Jack();
        ja.insertVal("jack", 16002);
        System.out.println("Name : " + ja.name);
        System.out.println("Roll : " + ja.roll);
    }
}