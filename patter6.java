/*
	pattern6
	5
	44
	333
	2222
	11111
*/


import java.util.Scanner;
class patter6
{
	public static void main(String[] args)
	{
		int i,j,count=5,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of n :");
		n= sc.nextInt();
		for (i=n;i>=1 ;i--) 
		{
			for (j=n;j>=i;j-- ) 
			{
				System.out.print(i);
			}
		System.out.println();
	}

}
}