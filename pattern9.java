/*
	pattern9
			1 2 3 4 5
			1 2 3 4
			1 2 3
			1 2
			1
*/

import java.util.Scanner;
class pattern9
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of n:");
		n =sc.nextInt();
		for (i=n;i>0 ;i-- ) 
		{
			for (j=1;j<=i ;j++ ) 
			{
				System.out.print(j);		
			}	
			System.out.println();
		}
	}
}