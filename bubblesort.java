/*
	arr={4 6 2 9 0 1}

	incremented arr={0 1 2 4 6 9}
	decrement arr={9 6 4 2 1 0}
*/

import java.util.Scanner;
class bubblesort
{
	public static void main(String[] args)
	{
		int n,i,j,temp=0;
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the size of array :");
		n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements :");
		for (i=0;i<n ;i++ ) 
		{
			arr[i]=sc.nextInt();	
		}

		//incremented order 
		for (i=0;i<n ;i++ ) 
		{
			for (j=0;j<n-1 ;j++ ) 
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}	
				
			}	
		}
		System.out.print("sorted array increment order :");
		for (i=0;i<n ;i++ ) 
		{
			System.out.print(arr[i] + "");	
		}

		//decremented order
		for (i=0;i<n ;i++ ) 
		{
			for (j=0;j<n-1 ;j++ ) 
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}	
				
			}	
		}
		System.out.print("sorted array decremented order :");
		for (i=0;i<n ;i++ ) 
		{
			System.out.print(arr[i] + "");	
		}
	}
}