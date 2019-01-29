import java.util.Scanner;
class pattern5
{
	public static void main(String[] args)
	{
		int i,j,count,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		n= sc.nextInt();
		for(i=n;i>0;i--)	
		{
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();		
		}
	}
}