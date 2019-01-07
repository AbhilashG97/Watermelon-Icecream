public class PuppyFruit {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Lychee lychee = new Lychee();
        lychee.sayFruitName("Lychee");

        Lychee anotherLychee = new Lychee();
        anotherLychee.sayWatermelon();
        
        /**
         * Both ChocolateIcecream and ChocolateWaffle have @Dessert annotation as the @Dessert annotation has 
         * an @Inherited annotation applied to it.
         */
        ChocolateIcecream chocolateIcecream = new ChocolateIcecream();
        chocolateIcecream.saySomethingAwesome();

        ChocolateWaffle chocolateWaffle = new ChocolateWaffle();
        chocolateWaffle.saySomethingAwesome();
        
    }
}
