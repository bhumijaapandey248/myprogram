/*
arr[]={1,2,3,4,5}
arr[]={5,1,2,3,4}
*/

import java.util.Scanner;
class rotatearray
{
	public static void main(String[] args)
	{
		int n ,i;
		Scanner input= new Scanner(System.in);
		System.out.print("enter the number :");
		n= input.nextInt();

		int a[] = new int[n];
		
		System.out.println("enter the "+ n +" values");
		
			
		for (i=0;i<n ;i++ )
		{
			a[i]=input.nextInt();	
		}
		int temp=a[n-1];
		for (i=n-1;i>=1 ;i-- )
		{
			a[i]=a[i-1];	
		}
		a[0]=temp;
		for(i=0;i<n;i++)
		{
		
		System.out.print("" + a[i]);
		}
	}

}