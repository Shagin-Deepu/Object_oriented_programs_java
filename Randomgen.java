import java.util.Random;
class RandomNumberGenerator extends Thread 
{
	public void run()
	{	
		Random random = new Random ();
		for (int i=0;i<5;i++)
		{
			int randomNumber = random. nextInt(100);
			System.out.println ("Generated Number is :"+ randomNumber);
			if (randomNumber %2 == 0)
			{	SquareThread squareThread = new SquareThread(randomNumber);
				squareThread.start ();
			}
			else 
			{	CubeThread cubeThread = new CubeThread(randomNumber);
				cubeThread.start();
			}
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}	
}

class SquareThread extends Thread 
{	
	private int number;
	SquareThread (int n) {		number = n;	}
	
	public void run ()
	{	int square = number*number;
		System.out.println ("Square of " + number+ "=" +square );
	}
}

class CubeThread extends Thread 
{
	private int number;
	CubeThread (int n) {		number = n;	}
	
	public void run ()
	{	
		int cube = number*number*number ;
		System.out.println ("Cube of " + number+ "=" +cube );
	}
}

class Randomgen
{
	public static void main (String []args )
	{
		RandomNumberGenerator rng = new RandomNumberGenerator();
		rng.start();
	}
}
	
