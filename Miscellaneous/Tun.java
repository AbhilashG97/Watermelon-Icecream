import fish.Tuna;

class Tun extends tuna {

    @Override 
    public void geese(){
        System.out.println("This method has been overridden.");
    }
    public static void main(String[] args){
        Tuna t = new Tuna();
        t.goose();
        t.geese();
    }
}