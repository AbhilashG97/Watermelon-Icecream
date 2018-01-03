class Product {
    int id;
    int price;
    String productName;

    public Product(int id, int price, String productName){
        this.id = id;
        this.price = price;
        this.productName = productName;
    }
}

class Jamun {
    String madeOn;
    int expiry;
    Product product;

    Jamun(String madeOn, int expiry, Product product) {
        this.madeOn = madeOn;
        this.expiry = expiry;
        this.product = product;
    }

    void display() {
        System.out.println("Product ID : "+product.id+" Price : "+product.price+" Product Name : "+product.productName);
        System.out.println("Manufacturing Year : "+madeOn+" Expiry date : "+expiry);
    }

}

class Jam{
    public static void main(String[] args){
        Product product = new Product(2323, 23, "Jack");
        Jamun jamun = new Jamun("January", 3, product);
        jamun.display();
    }
}