import java.io.*;
import java.util.*;
class garr

{	protected void finalize()
{
		System.out.println("obj memory is released ");		
	}
	public static void main (String args[])
	{	
		garr g = new garr();
		g  = null;
		System.gc();	
		}
		
		
	}	
