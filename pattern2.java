/* pattern2
0
1 0
0 1 0
1 0 1 0
*/
import java.util.Scanner;
class pattern2
{
	public static void main(String[] args)
	{
			int i,j,n;
			Scanner in= new Scanner(System.in);
			System.out.print("enter the value of n :");
			n= in.nextInt();
			for (i=0;i<=4;i++ )
			{
			    for(j=0;j<=i ;j++ )
				{
					if ((i+j)%2==0)
					{
						System.out.print(" 0 ");
					}	
						else
							System.out.print(" 1 ");

				}
					System.out.println();
			}

	}

}