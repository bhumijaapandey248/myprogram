/*
	arr={3 2 1 5 6}

	missing no. =4
*/

import java.util.Scanner;
class summisno
{
	public static void main(String[] args)
	{
		int n,i,sum1=0,sum2=0,sub,N;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		N=sc.nextInt();

		n=N-1;
		
		int arr[]= new int[n];

		System.out.print("Enter the array elements :");
		for (i=0 ;i<n;i++ ) 
		{
			arr[i]=sc.nextInt();	
		}

		for (i=0;i<=N ;i++ ) 
		{
			sum1=sum1+i;	
		}

		for(i=0;i<n;i++)
		{
			sum2=sum2+arr[i];
		}
		sub=sum1-sum2;
		//System.out.print("sum1="+sum1);
		//System.out.print("sum2="+sum2);
		System.out.print("Missing Number :="+sub);
	}
}