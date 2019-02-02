/*
	arr={1 2 3 4 5 6 7 8}
	k=2
	output={8 5 2}
*/
import java.util.Scanner;
class Ndigitarray
{
	public static void main(String[] args)
	{
		int i,n,k,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the value of K :");
		k=sc.nextInt();
		System.out.print("Enter the array elements :");
		for (i=0;i<n ;i++ ) 
		{
			arr[i]=sc.nextInt();	
		}

		for (i=n-1;i>=0 ;i=i-(k+1) ) 
		{
			System.out.print(" " +arr[i]);
		}
	}
}