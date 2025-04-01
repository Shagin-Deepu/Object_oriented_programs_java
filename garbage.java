import java.io.*;
import java.util.*;
class garbage
{	protected void finalize()
	{	System.out.println("obj,memory is released ");		}
	
	public static void main (String args[])
	{	
		garbage g = new garbage();
		g  = null;
		System.gc();	}}
