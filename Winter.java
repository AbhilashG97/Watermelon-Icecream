interface Thrones {
    void seasonName(String x, int y);
}

interface Of {
    void seasonName(String x, int y);
}

class Winter implements Of, Thrones {
    public void seasonName(String x, int y){
        System.out.println(x + y);
    }

    public static void main(String[] args){
        Game n = new Game();
        n.seasonName("Winter's coming ", 2017); 
    }
}