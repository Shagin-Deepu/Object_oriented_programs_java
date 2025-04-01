import java.io.*;
class ExceptionHandling
{	
	public static void main (String [] args)
	{	
		try 
		{	
			int result = divide (5,0);
			System.out.println ("result:"+result);
		}
		
		catch (ArithmeticException e)
		{	
			System.out.println("error: divisor by zero ");
		}
		
		finally 
		{
			System.out.println("finlly block is executed ");
		}
	}

	public static int divide (int a ,int b )
	{

		if (b == 0)
		{	
			throw new ArithmeticException("cannot divide by zero ");
		}
		else
		{
			return a/b;
		}
	}
}
