import java.io.*;
class file_handling
{	public static void main (String args[])
{
try 
{
	FileReader F1 = new FileReader("F1.txt");
	FileReader F2 = new FileReader("F2.txt");
	FileWriter F3 = new FileWriter("F3.txt");
	
	int i;
	
	while ((i = F1.read())!= -1)
	{	F3.write(i);	}
	while ((i = F2.read())!= -1)
	{	F3.write(i);	}
		
		F1.close();
		F2.close();
		F3.close();
	}
	catch(IOException e)
	{
	System.out.println(e.getMessage());
	}}}
