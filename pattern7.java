/*
	pattern7
	5
	54
	543
	5432
	54321
*/
import java.util.Scanner;
class pattern7
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of n :");
		n= sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for (j=n;j>=i ;j-- ) 
			{
				System.out.print(j);	
			}
			System.out.println();
		}
	}
}
