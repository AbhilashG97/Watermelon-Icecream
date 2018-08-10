public class Watermelon {

    private String shape;

    public Watermelon() {
        //default
    }

    public Watermelon(String shape) {
        this.shape = shape;
    }

    public String saySomething() {
        System.out.println("My watermelon-y shape is "+getShape());
        return new String();
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

}