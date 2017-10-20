class bottle {
    bottle() {
        System.out.println("This is a bottle of ");
    }

    void about(String x) {
        System.out.println("It is said that rum is made from **** " + x);
    }
}

class rum extends bottle {

    @SuppressWarnings("unchecked")
    rum(){
        super();
        System.out.println("rum.");           
    }
    void about(String x){
        super.about("LALA");
        System.out.println("Now, that is not true.");
    }
    public static void main(String[] args){
        rum r = new rum();
        r.about("HorseShit");
    }
}
