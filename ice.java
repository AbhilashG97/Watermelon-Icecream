class hot{
    int x = 4500;
}

class ice extends hot {
    int y = 345;
    public static void main(String args[]){
        ice i = new ice();
        System.out.println(i.x + " " + i.y);
    }
}