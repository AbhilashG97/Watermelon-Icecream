import fish.tuna;

class Tun extends Tuna {

    public static void main(String[] args) {
        Tuna t = new Tuna();
        t.goose();
        t.geese();
    }

    @Override
    public void geese() {
        System.out.println("This method has been overridden.");
    }
}