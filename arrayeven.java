/*
	arr ={2 4 7 2 9 1 0}
	
	even place array= {2 7 9 0}
*/

import java.util.Scanner;
class arrayeven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	int i;
	System.out.print("Enter the array size :");
	int n=sc.nextInt();
	int arr[] = new int[n];
	System.out.print("Enter the array elements :");
	for (i=0;i<n ;i++ ) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.print("Even places array :");
	for( i=0;i<n ;i=i+2) 
	{
		System.out.print(arr[i]);	
	}
	}
}