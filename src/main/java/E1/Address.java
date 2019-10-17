package E1;

import javax.management.RuntimeErrorException;

public class Address 
{
	String place;
	String street;
	String houseNumber;
	int zipCode;
	
	public Address(String place, String street, String houseNumber, int zipCode)
	{
		if(Character.isLowerCase(street.charAt(0)) || Character.isLowerCase(place.charAt(0)))
		{
			throw new RuntimeException("Streat and Place have to start with a capital Letter");
		}
		else if(!houseNumber.startsWith("\\[0-9]"))
		{
			throw new RuntimeException("Housenumber has to start with a number");
		}
		this.place = place;
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
	}
}
