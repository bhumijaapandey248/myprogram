/*
	matrix= 1 2 3 4
			5 6 7 8
			9 10 11 12
			13 14 15 16

		border elements= 1 2 3 4
						8 12
						16 15 14 13
						9 6

*/

import java.util.Scanner;
class matrixcorner
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of matrix :");
		n=sc.nextInt();
		
		int m1[] []=new int[n][n];//array declare
		System.out.println(" Enter the elements of Matrix :");
		for (i=0;i<n ;i++ )
		{
			for (j=0;j<n ;j++ )
			{
				m1[i][j]= sc.nextInt();		
			}	
		}
		for(i=0;i<n;i++) //first row
		{
			System.out.print("" +m1[0][i]);

		}
		for (i=1;i<n-1 ;i++ ) 	//last col
		{
			System.out.print("" +m1[i][n-1]);
		}                                                                                                                                 
		for(i=n-1;i>=0;i--) // last row 
		{
			System.out.print("" +m1[n-1][i]);
		}
		for(i=n-2;i>1;i--) //first col
		{
			System.out.print("" +m1[i][0]);
		}
		
		System.out.println();
	}
}
