
public class Address {
	
	private String streetName;
	private String city;
	private String state;
	private int pinCode;
	
	public Address(String streetName, String city, String state, int pinCode) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getStreetName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getPinCode() {
		return pinCode;
	}
	
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode
				+ "]";
	}
	
}
