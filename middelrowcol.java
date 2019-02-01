/*
	matrix= 1 2 3 4 5
			6 7 8 9 10
			11 12 13 14 15
			16 17 18 19 20
			21 22 23 24 25

		middler row nd col=11 12 13 14 15 3 8 13 18 23
*/
import java.util.Scanner;
class middelrowcol
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of matrix");
		n= sc.nextInt();
		int m [][]=new int[n][n];
		System.out.println(" Enter the elements of Matrix :");
		for (i=0;i<n ;i++ )
		{
			for (j=0;j<n ;j++ )
			{
				m[i][j]= sc.nextInt();		
			}	
		}
		for (i=0;i<n ;i++ ) //1st row
		{
			System.out.println(" " +m[n/2][i]);
		}
		for (i=0;i<n ;i++ ) 
		{
			System.out.println("  "  +m[i][n/2]);	
		}
		System.out.println();	
		
	}
}