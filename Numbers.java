import java.util.Scanner;

class Numbers{
     
     private int[] numbers;
     private int[] even;
     private int[] odd;
     private int size;
     Scanner s;

     Numbers(int size){
        this.size= size;
        numbers  = new int[size];
        even = new int[size];
        odd = new int[size];
        s = new Scanner(System.in);
     }

     public void insert(){
         for(int i=0; i<size; i++){
             numbers[i] = s.nextInt();
         }
     }

     public void sort(){
         for(int i=0; i<size; i++){
             if(numbers[i]%2==0){
                 even[i] =  numbers[i];
             }else {
                 odd[i]=numbers[i];
             }
         }
     }

     public void display(){
         System.out.println("-----------------\n----------\n---------");
         for(int i:even){
             System.out.println(i);
         }
         System.out.println("-----------------\n------------\n----------");
         for(int i:odd){
             System.out.println(i);
         }
     }

     public static void main(String[] args){
         Scanner j = new Scanner(System.in);
         int n = j.nextInt();
         Numbers m = new Numbers(n);
         m.insert();
         m.sort();
         m.display();
     }

}
