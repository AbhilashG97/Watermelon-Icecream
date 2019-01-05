class Melon {
    
    private float mPrice;
    private float mWeight;

    public Melon (float price, float weight) {
        mPrice = price;
        mWeight = weight;
    }

    public float getWeight() {
        return mWeight;
    }

    public float getPrice() {
        return mPrice;
    }

    @Override
    public String toString() {
        return mPrice + " " + mWeight;
    }
}

public class Watermelon {
    public static void main(String[] args) {
        Melon melon = new Melon(12f, 232f);
        System.out.println(melon);
    }
}
