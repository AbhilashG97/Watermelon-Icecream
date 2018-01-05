import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PersonDemo {
	
	// We are using the Predicate<T> functional interface
	
	public void printSpecificPeople(List<Person> people, Predicate<Person> condition) {
		for(Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
	}
	
	public static void main(String[] args) {
		
		PersonDemo personDemo = new PersonDemo();
		
		List<Person> people = Arrays.asList(
				new Person("Lucy", "Jameson", 20),
				new Person("Jack", "Hughes", 67),
				new Person("James", "Kally", 32),
				new Person("Yanick", "Louise", 12),
				new Person("Luciella", "Carlson", 21),
				new Person("Lewis", "Carllol", 45)
				);
		
		Collections.sort(people);
		personDemo.printSpecificPeople(people, person -> true);
		
		System.out.println("\nxxxxxxxxxx\n");
		
		// Implementation of Test method which belongs to the 
		// Predicate Functional Interface  
		
		personDemo.printSpecificPeople(people, (person) -> {
			return person.getLastName().startsWith("C");
		});

	}
}
