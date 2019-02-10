public class Icecream {
    
    private String icecreamName;
    private int icecreamPrice;

    public Icecream(String icecreamName, int icecreamPrice) {
        this.icecreamName = icecreamName;
        this.icecreamPrice = icecreamPrice;
    }

    public void setIcecreamName(String icecreamName) {
        this.icecreamName = icecreamName;
    }

    public void setIcecreamPrice(int icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }

    public String getIcecreamName() {
        return icecreamName;
    }

    public int getIcecreamPrice() {
        return icecreamPrice;
    }

    @Override
    public String toString() {
        return icecreamName + " " + icecreamPrice; 
    }
}