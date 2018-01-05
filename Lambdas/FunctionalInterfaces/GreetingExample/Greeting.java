@FunctionalInterface
public interface Greeting {
    void sayGreeting();
    default void sayYahooo(){
	System.out.println("Yahoo");
	}
	        
}
