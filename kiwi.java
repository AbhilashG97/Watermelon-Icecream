class kiwi{
    int x, y;
    String name;

    kiwi(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    kiwi (){
        this(23, 45, "Jack the Ripper");
            System.out.println(x+" "+y+" "+name);
    }

    public static void main(String[] args){
        kiwi a = new kiwi();
    }
}