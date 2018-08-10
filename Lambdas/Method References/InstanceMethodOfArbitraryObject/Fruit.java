public class Fruit {
    
    private RedKiwi redKiwi;

    public Fruit() {

    }

    public Fruit(RedKiwi redKiwi) {
        this.redKiwi = redKiwi;
    }

    public void modifyTaste(RedKiwi redKiwi) {
        this.redKiwi.setTaste(redKiwi.getTaste());
    }

    public void kiwiTaste(RedKiwi redkiwi) {
        this.redKiwi = redkiwi;
        System.out.println("Taste : "+redKiwi.getTaste()+"\nColor : "+redkiwi.getColor());
    }

}