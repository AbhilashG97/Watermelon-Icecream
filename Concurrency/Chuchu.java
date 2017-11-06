import java.util.*;
import java.io.*;

class Hi implements Runnable	{
	public void run()	{
		for(int i=0;i<5;i++)	{
			System.out.println("Hi");
			try{ Thread.sleep(500);	} catch(Exception e) {}
		}
	}
}

class Hello	implements Runnable	{
	public void run()	{
		for(int i=0;i<5;i++)	{
			System.out.println("Hello");
			try{ Thread.sleep(500);	} catch(Exception e) {}		}
	}
}

public class Chuchu	{
	public static void main(String[] args)	{
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();	// calls run method of Thread class and not from this class
		t2.start();
	
	}
}