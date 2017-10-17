import fish.tuna;

class Tun extends tuna {

    @Override 
    public void geese(){
        System.out.println("This method has been overridden.");
    }
    public static void main(String[] args){
        tuna t = new tuna();
        t.goose();
        t.geese();
    }
}
