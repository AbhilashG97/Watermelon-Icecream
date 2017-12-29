public class Sweet extends PiriPiri{


	@Override
	public void saySomething(){
		for(int i=0; i<10; i++){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws Exception{
		String a = "apple";
		Candy<Integer> c = new Candy<Integer>(10, a);
		PiriPiri pp1 = new PiriPiri();
		PiriPiri pp2 = new PiriPiri();
		Sweet s1 = new Sweet(), s2 = new Sweet();
		s1.run();
		s2.run();
		s1.start();
		s2.start();
		pp1.start();
		pp2.start();

		for(int i=0; i<3; i++){
			pp1.run();
			pp1.sleep(500);
			pp2.run();
		}


		Thread t1 = new Thread(new Runnable(){
			public void run(){
				System.out.println("AbhilashG");
			}
		}, "Abhilash");
		t1.start();

		Thread t2 = new Thread() {
			@Override 
			public void run(){
				for(int i=56; i<97; i++){
					System.out.print(" "+(char)i);
				}
			}	
		};
		t2.start();
		System.out.println(t1.getState()+" "+t2.getState());
		t1.run();
		t1.run();
		t1.sleep(100);
		t2.run();

	}
}