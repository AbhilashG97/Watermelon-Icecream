class Product {
    int id;
    int price;
    String pName;

    public Product(int id, int price, String pName) {
        this.id = id;
        this.price = price;
        this.pName = pName;
    }
}

class Jamun {
    String madeOn;
    int expiry;
    Product pro;

    Jamun(String madeOn, int expiry, product pro) {
        this.madeOn = madeOn;
        this.expiry = expiry;
        this.pro = pro;
    }

    void display() {
        System.out.println("Product ID : " + pro.id + " Price : " + pro.price + " Product Name : " + pro.pName);
        System.out.println("Manufacturing Year : " + madeOn + " Expiry date : " + expiry);
    }

}

class Jam {
    public static void main(String[] args) {
        Product p = new Product(2323, 23, "Jack");
        Jamun j = new Jamun("January", 3, p);
        j.display();
    }
}