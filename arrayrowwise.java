/* matrix 
	m1= 2 4 6
		5 7 9
		3 5 1
	reverse
	m2= 2 5 3
		4 7 5
		6 9 1
*/
import java.util.Scanner;
class arrayrowwise
{
	public static void main(String[] args)
	{
		int i,j,row,col;
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter the no. of rows :");
		row=sc.nextInt();
		System.out.print("Enter the no. of column :");
		col=sc.nextInt();
		
		int m1[] []=new int[row][col];//array declare
		int m2[] []=new int[row][col];

		System.out.println(" Enter the elements of Matrix :");
		for (i=0;i<row ;i++ )
		{
			for (j=0;j<col ;j++ )
			{
				m1[i][j]= sc.nextInt();		
			}	
		}
		//System.out.print(" Matrix after reverse :");
		for (i=0;i<row ;i++ )
		{
			for (j=0;j<col ;j++ )
			{
				m2[i][j]=m1[j][i];
			}	
		}

		System.out.println(" Reverse Matrix :");
		for (i=0;i<row ;i++ )
		{
			for (j=0;j<col ;j++ )
			{
				System.out.print(m2[i][j]+" ");		
			}
			System.out.println();	
		}
	}


}