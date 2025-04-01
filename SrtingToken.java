import java.util.*;
class SrtingToken	{
public static void main (String [] args )
{
	int n;
	int sum=0;
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the integers with one space gap:");
	String s = sc.nextLine();
	StringTokenizer st = new StringTokenizer(s," ");
	while(st.hasMoreTokens())
	{
	String temp = st. nextToken();
	n = Integer.parseInt(temp);
	System.out.println(n);
	sum = sum+n;	
	}
	System.out.println("Sum of integers is:" + sum);
	sc.close();
	}
}
