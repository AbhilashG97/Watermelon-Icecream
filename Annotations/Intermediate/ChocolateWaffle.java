/**
 * @Dessert annotation gets automatically applied here because of the 
 * @Inherited annotation used in it.
 */

public class ChocolateWaffle extends ChocolateIcecream {

    @Override
    public void saySomethingAwesome() {
        System.out.println("Chocolate is awesome !!");
    }

} 