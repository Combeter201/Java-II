package E1Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import E1.Sphere;

public class SphereTest 
{
	@Test
	public void VolumeTest()
	{
		assertEquals(0, Sphere.calculateVolume(0), 0.001);
		assertEquals(4.189, Sphere.calculateVolume(1), 0.001);
		assertEquals(523.599, Sphere.calculateVolume(5), 0.001);
		
		try
		{
			Sphere.calculateVolume(-1);
			fail();
		}
		catch(RuntimeException e)
		{
			if(!e.getMessage().equals("No negative Values"))fail();
		}
	}
}
