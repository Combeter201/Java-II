package E1Test;

import static org.junit.Assert.fail;

import org.junit.Test;

import E1.Address;
import E1.Person;

public class PersonTest 
{
	@Test
	public void firstNameTest()
	{
		try
		{
			Person person = new Person("Marco", "Polo", null);
		}
		catch(RuntimeException e)
		{
			fail();
		}
		
		try
		{
			Person person = new Person("marco", "Polo", null);
			fail();
		}
		catch(RuntimeException e)
		{
			if(!e.getMessage().equals("Firstname has to start with a capital Letter"))fail();
		}
	}
	
	@Test
	public void streetTest()
	{
		try
		{
			Address adress = new Address("Venice", "waterstreet", "1A", 30100);
			fail();
		}
		catch(RuntimeException e)
		{
			if(!e.getMessage().equals("Street and Place have to start with a capital Letter"))fail();
		}
	}
	
	@Test
	public void placeTest()
	{
		try
		{
			Address adress = new Address("venice", "Waterstreet", "1A", 30100);
			fail();
		}
		catch(RuntimeException e)
		{
			if(!e.getMessage().equals("Street and Place have to start with a capital Letter"))fail();
		}
	}
	
	@Test
	public void houseNumberTest()
	{
		try
		{
			Address adress = new Address("Venice", "Waterstreet", "1A", 30100);
		}
		catch(RuntimeException e)
		{
			fail("Fail");
		}
		
		try
		{
			Address adress = new Address("Venice", "Waterstreet", "A1", 30100);
			fail();
		}
		catch(RuntimeException e)
		{
			if(!e.getMessage().equals("Housenumber has to start with a number"))fail();
		}
	}
}
