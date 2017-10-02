interface Thrones {
    void seasonName(String x, int y);
}

interface of {
    void seasonName(String x, int y);
}

class winter implements of, Thrones {
    public void seasonName(String x, int y){
        System.out.println(x + y);
    }

    public static void main(String[] args){
        Game n = new Game();
        n.seasonName("Winter's coming ", 2017); 
    }
}