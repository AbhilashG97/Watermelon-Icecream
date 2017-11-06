import java.io.*;

class Counter {

	static int count;

	public static synchronized void increment(){
		count++;
	}

}

public class River {

	public static void main(String[] args) throws Exception{
		
		Thread t1 = new Thread(() -> {
			for(int i=0; i<5; i++){
				Counter.increment();
				System.out.println(Thread.currentThread().getName() + " " + Counter.count);	
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}							
			}

		}, "Even Thread");

		Thread t2 = new Thread(() -> {
			for(int i=0; i<5; i++){
				Counter.increment();
				System.out.println(Thread.currentThread().getName() + " " + Counter.count);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}								
			}		
		}, "Odd Thread");

		t2.start();
		Thread.sleep(1000);
		t1.start();

	}

}