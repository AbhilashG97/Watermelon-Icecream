
public class Student {
	
	private String firstName;
	private String lastName;
	private Address address;
	private int SGPA;
	
	public Student(String firstName, String lastName, Address address, int sGPA) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		SGPA = sGPA;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getSGPA() {
		return SGPA;
	}
	
	public void setSGPA(int sGPA) {
		SGPA = sGPA;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", SGPA=" + SGPA
				+ "]";
	}
	
	
}
