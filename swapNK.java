/*
	arr={1 2 3 4 5 6 7 8}
	k=3
	arr={1 2 6 4 5 3 7 8}
*/

import java.util.Scanner;
class swapNK
{
	public static void main(String[] args)
	{
		int i,j,n,k,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		n=sc.nextInt();
		System.out.print("Enter the value of k :");
		k=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements :");
		for (i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();	
		}
			temp=arr[k-1];
			arr[k-1]=arr[n-k];
			arr[n-k]=temp;
		
		for (i=0;i<n ;i++ ) 
		{
			System.out.print("" +arr[i]);	
		}
	}
}