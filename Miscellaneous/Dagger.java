interface Fruit {
    String fruitName(String x);  
}

interface Desert {
    String desertName(String y);
}

class Dagger implements Desert, Fruit {
    @Override
    public String fruitName(String x){
        return x;
    }
    @Override
    public String desertName(String y){
        return y;
    }

    public static void main(String args[]){
        Fruit fruit = new Dagger();
        System.out.println(fruit.fruitName("Mango"));
        Desert desert = new Dagger();
        System.out.println(desert.desertName("Baked Alaska"));
    }
}
