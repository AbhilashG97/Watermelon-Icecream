class Product {
    int id;
    int price;
    String pName;

    public product(int id, int price, String pName){
        this.id = id;
        this.price = price;
        this.pName = pName;
    }
}

class Jamun {
    String madeOn;
    int expiry;
    product pro;

    jamun(String madeOn, int expiry, product pro) {
        this.madeOn = madeOn;
        this.expiry = expiry;
        this.pro = pro;
    }

    void display() {
        System.out.println("Product ID : "+pro.id+" Price : "+pro.price+" Product Name : "+pro.pName);
        System.out.println("Manufacturing Year : "+madeOn+" Expiry date : "+expiry);
    }

}

class Jam{
    public static void main(String[] args){
        product p = new product(2323, 23, "Jack");
        jamun j = new jamun("January", 3, p);
        j.display();
    }
}