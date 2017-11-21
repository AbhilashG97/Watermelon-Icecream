class MeraNamChabbe{

	private static String chabbe = "chabbe";
	private static int counter = 0;

	synchronized public static void printChabbe(){
		System.out.println(chabbe + " " + counter + " " + Thread.currentThread().getName());
		counter++;
	}

}

class Odd extends Thread{

	public Odd(String threadName){
		super(threadName);
	}

	public void run(){
		for(int i=1; i<=10; i+=2){
			MeraNamChabbe.printChabbe();
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				System.err.println(ie);
			}
		}
	} 
}


class Even extends Thread{

	public Even(String threadName){
		super(threadName);
	}

	public void run(){
		for(int i=0; i<=10; i+=2){
			MeraNamChabbe.printChabbe();
						try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				System.err.println(ie);
			}
		}
	}
}


public class Jojoba {

	public static void main(String[] args) {
		Odd odd = new Odd("Odd");
		Even even = new Even("Even");

		even.start();
		try{
			Thread.sleep(100);
		}catch(Exception e){
				System.err.println(e);
		}
		odd.start();
			
	}
}