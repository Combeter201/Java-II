package de.fhws.streams;

import static org.junit.Assert.*;
import org.junit.Test;

public class SignTest 
{
	@Test
	public void testNegativeSignOperator()
	{
		assertTrue(-1 == sign.sign(-5));
	}
	
	@Test
	public void testPositiveSignOperator()
	{
		assertTrue(1 == sign.sign(5));
	}
	
	@Test
	public void testNeutralSignOperator()
	{
		assertTrue(0 == sign.sign(0));
	}
	
//	@Test
//	public void testSignOperator()
//	{
//		assertTrue(-1 == sign.sign(-5));
//		assertTrue(1 == sign.sign(5));
//		assertTrue(0 == sign.sign(0));
//	}
}

