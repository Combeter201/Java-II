package de.fhws.streams;

import javax.management.RuntimeErrorException;
import static org.junit.Assert.*;
import org.junit.Test;

public class Surface 
{
	public static int calculateSurface(int a, int b, int c)
	{
		if (a < 0 || b < 0 || c < 0) throw new RuntimeException("Invalid Parameter");
		return (2 * a * b + 2 * a * c + 2 * b * c);
	}
	@Test
	public void testFehlerfall()
	{
		try
		{
			calculateSurface(1, 1, -1);
			fail("Runtime Exception expected");
		}
		catch(RuntimeException e)
		{
			String errorMessage = e.getMessage();
			assertEquals("Invalid Parameter", errorMessage);
//			if(!e.getMessage().equals("Invalid Parameter")) fail("Test failed");
		}
	}
}
