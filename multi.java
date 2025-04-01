import java.util.*;
class multi
{	
	public static void main (String args[])
{	
	int i,j,k; 
	Scanner sc= new Scanner (System.in);
	System.out.println("enter number of rows and columns of 1st matrix");
	int m= sc.nextInt();
	int n= sc.nextInt();
	System.out.println("enter number of rows and columns of 2st matrix");
	int p= sc.nextInt();
	int q= sc.nextInt();
	if (n==p)
	{
	System.out.println("enter elements of 1st matrix");
	int mat1[][]=new int [m][n];
	for (i=0;i<m;i++)
	{	
		for (j=0;j<n;j++)
		{	
			mat1[i][j]=sc.nextInt();	}}
	System.out.println("enter elements of 2nd matrix");
	int mat2[][]=new int [p][q];
	for (i=0;i<p;i++)
	{	
		for(j=0;j<q;j++)
		{	
			mat2[i][j]=sc.nextInt();	}}
		int pro[][]=new int[m][q];
		for (i=0;i<m;i++)
		{	
			for (j=0;j<q;j++)
		{	
			pro[i][j]=0;	
		for (k=0;k<n;k++)
		{	
			pro[i][j]=pro[i][j]+mat1[i][k]*mat2[k][j];	}}}
	System.out.println("resultant matrix");
	for (i=0;i<m;i++)
	{	
		for (j=0;j<q;j++)
			{	System.out.println(pro[i][j]+"");
				System.out.println();	
}}}}}
