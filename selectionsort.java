/*
	arr={4 2 7 9 1 0}
	 incremented arr= 0 1 2 4 7 9
	 decremented arr= 9 7 4 2 1 0
*/

import java.util.Scanner;
class selectionsort
{
	public static void main(String[] args)
	{
		int i,j,temp,n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array :");
		n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements :");
		for (i=0;i<n ;i++ ) 
		{
			a[i]= sc.nextInt();	
		}
		for (i=0;i<=n ;i++ ) 
		{
			for (j=i+1;j<n ;j++ ) 
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
									
			}	
	
		}
		System.out.print("sorted array increment order :");
		for (i=0;i<n;i++ ) 
		{
			System.out.print("" +a[i]);	
		}
		for (i=0;i<=n ;i++ ) 
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		System.out.println("sorted array in decremented order :");
		for (i=0;i<n ;i++ ) 
		{
			System.out.print("" +a[i]);	
		}
	}
}