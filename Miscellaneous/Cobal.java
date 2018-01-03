class Cobal {

    int add(int x, int y){
        return x +y;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        Cobal cobal = new Cobal();
        int reA, reB;
        reA = cobal.add(34,56);
        reB = cobal.add(100, 100, 200);
        System.out.println(reA + " " + reB);
    }
}
