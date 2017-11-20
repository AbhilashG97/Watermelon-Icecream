import java.io.*;
import java.util.ArrayList;

public class Kinkade {

	public static class MyThread {

		private ArrayList<String> arr;

		public MyThread(){
			arr = new ArrayList<>();
		}

		Thread t1 = new Thread() {

			@Override
			public void run(){

				for(int i=0; i<10; i++){
					arr.add(i+" ");
				}						

			} 
		};

		Thread t2 = new Thread(){

			@Override
			public void run(){
				System.out.print(arr);
				// for(String i : arr){
				// 	System.out.print(i+" ");
				// }
			}

		};

		public void startAllThreads(){
			t1.start();
			t2.start();
		}
	}

	public static void main(String[] args) {
		Kinkade.MyThread blah = new Kinkade.MyThread();
		blah.startAllThreads();
		System.out.println(System.currentTimeMillis());
	}	
}