package E1Test;

import static org.junit.Assert.fail;

import org.junit.Test;

import E1.Point;

public class PointTest 
{
	@Test
	public void MovePointTest()
	{
		try
		{
			Point.movePoint(1,1);
			Point.movePoint(1920,1080);
			Point.movePoint(0, 0);
			Point.movePoint(5, 7);
		}
		catch(RuntimeException e)
		{
			if(e.getMessage().equals("Invalid Value for X or Y"))fail();
		}
	}
	
	
}
