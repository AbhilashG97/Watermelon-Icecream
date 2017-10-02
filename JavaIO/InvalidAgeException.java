import java.io.*;
import java.lang.*;

public class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String msg){
		super(msg);
	}
}