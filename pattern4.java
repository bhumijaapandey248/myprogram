/*
pattern4
2
3 4
5 6 7
8 9 10 11
*/
import java.util.Scanner;
class pattern4
{
	public static void main(String[] args) {
		int i,j,count=1,n;
		Scanner in=new Scanner(System.in);
		System.out.print(" enter the value of n :");
		n=in.nextInt();
		for (i=0;i<=n ;i++ )
		{
			for (j=0;j<i ;j++ )
			{
				count=count+1;
				System.out.print(count+" ");

			}	
			System.out.println();
		}
		
	}
}