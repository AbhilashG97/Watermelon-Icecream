interface fruit {
    String fruitName(String x);  
}

interface desert {
    String desertName(String y);
}

class Dagger implements desert, fruit {
    @Override
    public String fruitName(String x){
        return x;
    }
    @Override
    public String desertName(String y){
        return y;
    }

    public static void main(String args[]){
        fruit f = new Dagger();
        System.out.println(f.fruitName("Mango"));
        desert d = new Dagger();
        System.out.println(d.desertName("Baked Alaska"));
    }
}