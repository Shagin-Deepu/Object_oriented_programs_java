import java.io.*;
import java.util.*;
class Palindrome
{  public static void main (String args[])
	{
		String str;
		String rev="";
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		int len=str.length();
		for (i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed string is :" +rev);
		if (str.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		     }	
	}}
