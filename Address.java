public class Address
{
	//Attributes
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	//Setters
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}
	
	//Getters
	public String getStreet()
	{
		return this.street;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public String getState()
	{
		return this.state;
	}
	
	public String getZipCode()
	{
		return this.zipCode;
	}
	
	//Constructor and Copy Constructor
	public Address(String street, String city, String state, String zipCode)
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	//Need to place a Copy Constructor to allow the driver to use an address as the parameters
	public Address(Address copyingAddress)
	{
		this.street = copyingAddress.street;
		this.city = copyingAddress.city;
		this.state = copyingAddress.state;
		this.zipCode = copyingAddress.zipCode;
	}
	
	//toString Overriding
	public String toString()
	{
		return street + " \n" + city + ", " + state + " " + zipCode + " "; 
	}
	
	//Comparing of Attributes
	public boolean equals (Address compare)
	{
		return this.street.equalsIgnoreCase(compare.street) && this.city.equalsIgnoreCase(compare.city) && this.state.equalsIgnoreCase(compare.state) && this.zipCode.equalsIgnoreCase(compare.zipCode);
	}
}