class Hot{
    int x = 4500;
}

class Ice extends Hot {
    int y = 345;
    public static void main(String args[]){
        Ice i = new Ice();
        System.out.println(i.x + " " + i.y);
    }
}