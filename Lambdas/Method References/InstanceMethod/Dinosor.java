public class Dinosor {

    private String dinosorName;

    public Dinosor() {
        // Default
    }

    public Dinosor(String dinosorName)  {
        this.dinosorName = dinosorName;
    }

    public String saySomething() {
        System.out.println("I am a " + getDinosorName()+" dinosor");
        return new String();
    }

    public void setDinosorName(String dinosorName) {
        this.dinosorName = dinosorName;
    }

    public String getDinosorName() {
        return dinosorName;
    }

}