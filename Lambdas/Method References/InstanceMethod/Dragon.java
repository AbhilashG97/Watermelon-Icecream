public class Dragon {

    private String dragonName;

    public Dragon () {
        // Default
    }

    public Dragon(String dragonName) {
        this.dragonName = dragonName;
    }

    public void saySomething(String dragon) {
        System.out.println("I am a "+ dragon+ " dragon !!");
    }

    public void saySomething() {
        System.out.println("I am a "+getDragonName()+" dragon.");
    }

    public String saySomethingElse() {
        System.out.println("I am a "+getDragonName()+" dragon.");

        //return new String(null); 

        // the above code will throw an error because, here the compiler 
        // is unable to determine a specific constructor to which the null 
        // arguement can be applied
        // https://stackoverflow.com/questions/4802474/string-constructor-with-null-value 

        return new String();
    }

    public void setDragonName(String dragonName) {
        this.dragonName = dragonName;
    }

    public String getDragonName() {
        return dragonName;
    }

}