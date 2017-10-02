class Res {
    int srNo;
    String brand;

    Res(int srNo, String brand){
        this.srNo = srNo;
        this.brand = brand;
    }
}

class Org extends Res {
    double cost;
    Org(double cost, int srNo, String brand){
        super(srNo, brand);
        this.cost = cost;
    }

    void display(){
        System.out.println("Cost : "+cost+"\nSr No : "+srNo+"\nBrand : "+brand);
    }

    public static void main(String[] args){
        Org o = new Org(25.00, 23, "Samsang");
        o.display(); 
    }
}