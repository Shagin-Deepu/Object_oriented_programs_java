import java.util.Scanner;
class Array
{
public static void main (String args[])
{	int n;
	Scanner sc= new Scanner (System.in);
	System.out.println("enter number of elements ");
	n=sc.nextInt();
	int a[]=new int[10];
	System.out.println("enter the elements of array");
	for (int i=0;i<n;i++)
	{	a[i]=sc.nextInt();	}
	System.out.println("array elements are ");
	for(int i=0;i<n;i++)
	System.out.println (a[i]);	
}}
