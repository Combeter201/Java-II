package de.fhws.streams;

public class sign 
{
	public static int sign(double x)
	{
		if(x < 0) return -1;
		else if(x > 0) return +1;
		else return 0;
	}
}
