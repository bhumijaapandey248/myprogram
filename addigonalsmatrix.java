/*
	m1= 1 2 3 6
		9 2 5 9
		2 5 3 1
		0 2 7 4
	Addition of left digonal=10
	Addition of right digonal=16
	sum of corners =11
*/

import java.util.Scanner;
class addigonalsmatrix
{
	public static void main(String[] args)
	{
		int i,j,col,row,sum1=0,sum2=0,sum3=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows :");
		row= sc.nextInt();
		System.out.print("Enter the number of cols :");
		col=sc.nextInt();
	
		int m1 [][]=new int[row][col];

		System.out.println("Enter the array elements :");
		for (i=0;i<row ;i++ ) 
		{
			for (j=0;j<col ;j++ ) 
			{
				m1[i][j]=sc.nextInt();		
			}	
		}

		for (i=0;i<row ;i++ ) 
		{
			for(j=0;j<col;j++)
			{
				if(i==j)
				{
					sum1=sum1+m1[i][j];
				}

				if(row-1==i+j)
				{
					sum2=sum2+m1[i][j];
				}
			 
			}

		}
		sum3=sum3+m1[0][0]+m1[0][3]+m1[3][0]+m1[3][3];
		System.out.println("Addition of left digonal =" +sum1);
		System.out.println("Addition of right digonal =" +sum2);
		System.out.println(" sum of corners =" +sum3);
	}
}
