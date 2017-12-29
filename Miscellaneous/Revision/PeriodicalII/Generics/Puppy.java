public class Puppy extends Thread{

	public Puppy(String name){
		super(name);
		super.setName(name);
	}

	public void run(){
		for(int i=1; i<5; i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){

			}
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority());
	}

	public static void main(String[] args) throws Exception{
		// Puppy p1 = new Puppy("Watermelon");
		// Puppy p2 = new Puppy("Banana");
		// Puppy p3 = new Puppy("Apple");
		// p1.start();
		// p2.setName("bamama");
		// p3.setName("asdas");
		// p1.setName("Watermelon");
		// System.out.println(p1.getState()+" "+p1.currentThread().getName());
		// try{
		// 	p1.join();	
		// }catch(Exception e){

		// }
		// System.out.println(p1.getState()+" "+Thread.currentThread().getName());
		// p2.start();
		// System.out.println(p2.getState()+" "+Thread.currentThread().getName());

		// p3.start();
		// System.out.println(p3.getState()+" "+Thread.currentThread().getName());		
		// p1.run();

		Chu<String> c = new Chu<>();
		c.Chutia(12);
	}

}