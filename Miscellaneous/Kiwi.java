class Kiwi {
    int x, y;
    String name;

    Kiwi(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    Kiwi(){
        this(23, 45, "Jack the Ripper");
            System.out.println(x+" "+y+" "+name);
    }

    public static void main(String[] args){
        Kiwi a = new Kiwi();
    }
}