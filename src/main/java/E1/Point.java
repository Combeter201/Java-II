package E1;

public class Point 
{
	static int x;
	static int y;
	
	public static void movePoint(int newX, int newY)
	{
		if(newX < 0 || newY < 0 || newX > 1920 || newY > 1080)
		{
			throw new RuntimeException("Invalid Value for X or Y");
		}
		else
		{
			x = newX;
			y = newY;
		}
	}
}
