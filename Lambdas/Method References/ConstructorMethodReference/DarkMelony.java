public class DarkMelony {

    private String name;
    private String favoriteFruit;

    public DarkMelony() {
        // default constructor
    }

    public DarkMelony(String name, String favoriteFruit) {
        this.name = name;
        this.favoriteFruit = favoriteFruit;
    } 

    public DarkMelony giveIdentity(DarkMelony darkMelony, String name, String favoriteFruit) {
        darkMelony.setName(name);
        darkMelony.setFavoriteFruit(favoriteFruit);
        return darkMelony;
    }

    public void saySomething() {
        System.out.println("I am "+getName()+" and I like "+getFavoriteFruit()+" very much.");
    }  

    public String getFavoriteFruit() {
        return favoriteFruit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavoriteFruit(String favoriteFruit) {
        this.favoriteFruit = favoriteFruit;
    }

}