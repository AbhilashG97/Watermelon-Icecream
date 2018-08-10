public class BeautifulMelony {
    
    private String favouriteFruit;
    private String favouriteIceCream;

    public BeautifulMelony() {
        // Default
    }

    public BeautifulMelony(String favoriteFruit, String favoriteIceCream) {
        this.favouriteFruit = favoriteFruit;
        this.favouriteIceCream = favoriteIceCream;
    }

    public BeautifulMelony(String favoriteFruit) {
        this.favouriteFruit = favoriteFruit;
    }

    public void saySomething() {
        System.out.println("I am awesome !!");
    }
}