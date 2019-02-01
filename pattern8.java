/*
	pattern8

	55555
	4444
	333
	22
	1
*/
import java.util.Scanner;
class pattern8
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of n :");
		n= sc.nextInt();
		for (i=n;i>0;i-- ) 
		{
			for (j=0;j<i ;j++ ) 
			{
				System.out.print(i);
			} 	
			System.out.println();
		 } 
	}
}