/*
	matrix= 1 2 3 4 5
		6 7 8 9 10
		11 12 13 14 15
		16 17 18 19 20
		21 22 23 24 25

	output= 7 8 9 14 19 18 17 12
*/

import java.util.Scanner;
class secondMiddelMatrix
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the matix size :");
		n=sc.nextInt();
		int arr[][]=new int[n][n];
		System.out.print("Enter the matrix :");
		for (i=0;i<n ;i++ ) 
		{
			for (j=0;j<n ;j++ ) 
			{
				arr[i][j]=sc.nextInt();		
			}	
		}

		//for 2nd row
		for (i=1;i<=n-3 ;i++ ) 
		{
			System.out.print(" "+arr[1][i]);	
		}

		//for n-1 col
		for (i=1;i<=n-3 ;i++ ) 
		{
			System.out.print(" "+arr[i][n-2]);	
		}

		//for n-1 row
		for (i=n-2;i>1 ;i-- ) 
		{
			System.out.print(" "+arr[n-2][i]);	
		}

		//for 1st col
		for (i=n-2;i>1 ;i-- ) 
		{
			System.out.print(" "+arr[i][1]);	
		}
	}
}
