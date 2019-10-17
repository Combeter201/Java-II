package E1;

public class Person 
{
	String firstName;
	String secondName;
	Address address;
	
	public Person(String firstName, String secondName, Address address)
	{

		if(Character.isLowerCase(firstName.charAt(0)))
		{
			throw new RuntimeException("Firstname has to start with a capital Letter");
		}
		this.firstName = firstName;
		this.secondName = secondName;
		this.address = address;
	}
}
