
import java.util.Scanner;
class sort
{
	public static void main (String []args)
	{	
		int n,i,j,temp;
		int [] A = new int [10];
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the array size ");
		n = sc.nextInt();
		
		System.out.println ("enter the elements in the array");
		for (i=0;i<n;i++)
		{
		  A[i] = sc.nextInt();
		}
		for (i=0;i<n-1;i++)	
		{
			for (j=0;j<n-i-1;j++) 	
			{
				if (A[j]>A[j+1])  	
				{
					temp = A[j];
					A[j] = A[j + 1];
		   			A[j + 1] = temp;
				}	
			}
		}
		System.out.println ("Sorted array is:");
		for (i=0;i<n;i++)
		{	
			System.out.println(A[i] + " ");
		}
	}
}
		
