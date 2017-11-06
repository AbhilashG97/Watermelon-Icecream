public class Ocean {

	public static void main(String[] args) throws Exception{

	Thread t1 = new Thread( () ->
			{
			for(int i=1; i<10; i++){
				System.out.println("Hi");
				try{
				Thread.sleep(1000);				
		}catch(Exception e){

		}
			}
		}
	);

	Thread t2 = new Thread( () -> {
			for(int i=2; i<=10; i++){
				System.out.println("Hello");
				try{
				Thread.sleep(1000);
			}catch(Exception e){

			}
		}
	});
		//t1.setPriority(1);
		t1.start();
		Thread.sleep(100);
		t2.start();
		System.out.println(t1.currentThread().getState());
		System.out.println(t2.currentThread().getState());
		t1.join();
		t2.join();
		System.out.println("Bye");
		System.out.println(t1.currentThread().getState());
		System.out.println(t2.currentThread().getState());
	}
} 