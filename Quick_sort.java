import java.util.*;
class Quick_sort
{
	void quicksort(String names [],int low,int high)
	{ 	
		if (low<high)
	{
		int l=low,h=high,p=low;
		String temp;
		while(l<h)
		{
			while((names[l].compareToIgnoreCase(names[p])<=0)&&l<h)
			{
				l++;	
			}
			while((names[h].compareToIgnoreCase(names[p])>0))
			{
				h--;
			}
			if(l<h)
			{
				temp=names[l];
				names[l]=names[h];
				names[h]=temp;
			}
			temp = names[h];
			names[h]=names[p];
			names[p]=temp;
			quicksort(names,0,h-1);
			quicksort(names,h+1,high);
		}
	}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("number of names:");
		int n=sc.nextInt();
		String names[]=new String[n];
		sc.nextLine();
		Quick_sort b=new Quick_sort();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name"+(i+1)+":");
			names[i]=sc.nextLine();
		}
		
		b.quicksort(names,0,n-1);
		System.out.println("sorted list:");
		for(String i:names)
		{
			System.out.println(i);
		}
	}
}
