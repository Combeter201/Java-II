package E1;

public class Fraction 
{
	int numerator;
	int denominator;
	
	public Fraction(int numerator, int denominator)
	{
		if(denominator == 0) 
		{
			throw new ArithmeticException("No negative denominator");
		}
		
		this.numerator = numerator;
		this.denominator = denominator;
	}
}
