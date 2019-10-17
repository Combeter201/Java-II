package E1Test;

import static org.junit.Assert.fail;

import org.junit.Test;

import E1.Fraction;

public class FractionTest 
{
	@Test
	public void denominatornotNull()
	{
		try
		{
			Fraction fraction = new Fraction(1, 0);
			fail();
		}
		catch(ArithmeticException e)
		{
			if(!e.getMessage().equals("No negative denominator"))fail();
		}
	}
}
