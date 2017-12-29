import java.util.*;
import java.io.*;

public class MyProg {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();

		String[] inputs = input.split(",");
		for(String i :  inputs){
			System.out.print(i + " ");
		}
		

		while(true){
					if(input.contains("ban")){
			while(input.contains("ban")){
				input = input.replace("ban", "bab");
			}
		}else if(input.contains("baba")){
			while(input.contains("baba")){
				input = input.replace("baba" , "be");
			}
		}else if(input.contains("ana any")){
			while(input.contains("ana any")){
				input = input.replace("ana any", "any");
			}
		}else if(input.contains("ba b")){
			while(input.contains("ba b")){
				input = input.replace("ba b", "hind the g");
			}
		}else{
			break;
		}
	}

		//System.out.println(input);
	}
}