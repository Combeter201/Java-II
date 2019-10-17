package E1;

public class Sphere 
{
	public static double calculateVolume(double radius)
	{
		if(radius >= 0)
		{
			return 4/3.0*Math.PI*radius*radius*radius;
		}
		else 
		{
			throw new RuntimeException("No negative Values");
		}
	}
}
