public class Fruit {

    private String fruitName;
    private int fruitPrice;

    public Fruit(String fruitName, int fruitPrice) {
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    
    public void setFruitPrice(int fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getFruitPrice() {
        return fruitPrice;
    }

    @Override
    public String toString() {
        return fruitName + " " + fruitPrice;
    }
}   