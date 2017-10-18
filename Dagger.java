interface Fruit {
    String fruitName(String x);
}

interface Desert {
    String desertName(String y);
}

class Dagger implements Desert, Fruit {
    public static void main(String args[]) {
        fruit f = new Dagger();
        System.out.println(f.fruitName("Mango"));
        desert d = new Dagger();
        System.out.println(d.desertName("Baked Alaska"));
    }

    @Override
    public String fruitName(String x) {
        return x;
    }

    @Override
    public String desertName(String y) {
        return y;
    }
}