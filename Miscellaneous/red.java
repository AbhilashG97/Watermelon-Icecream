class test{
    void calFact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

class red{
    public static void main(String[] args){
        new test().calFact(5);
    }
}