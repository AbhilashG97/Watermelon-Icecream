public class Blue {

	private int fact;

    public Blue(int n){
    	fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
    }

    public void displayFactorial(){
    	System.out.println(fact);
    }

    public static void main(String args[]){
        new Blue(5).displayFactorial();
    }   
}
