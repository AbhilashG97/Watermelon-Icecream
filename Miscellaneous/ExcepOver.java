import java.io.*;

class ExcepOver{

	public void jam(int num) throws IOException{
		if(num < 5){
			throw new IOException();
		}
	}

	public void bread(String brand){
		System.out.println(brand);
	}

	public static void main(String []args) throws Exception{
		ExcepOver eo = new ExcepOver();
		try{
			eo.jam(3);
		}catch(Exception e){
			throw new Exception(e);
		}
		
	}

}
