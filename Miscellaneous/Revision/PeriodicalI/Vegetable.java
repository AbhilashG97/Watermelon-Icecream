class Max {
    String vName;
    double price;

    Max(String vName, double price){
        this.vName = vName;
        this.price = price;
    }
}

class Vegetable extends Max {
    
    String month;
    String season;

    Vegetable(String month, String season, String vName, double price){
        super(vName, price);
        this.month = month;
        this.season = season;
    }

    void display(){
        System.out.println("Name of the Vegetable : "+vName+"\nPrice : "+price+"\nMonth : "+month+"\nSeason : "+season);      
    }

    public static void main(String[] args){
        Vegetable v = new Vegetable("January", "Winter", "Potato",  25.00);
        v.display(); 
    }
}