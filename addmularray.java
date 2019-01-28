/*
 array = 3 1 5 7 3 1

 sum of even places number =11
 multiple of odd places number =7
*/

import java.util.Scanner;
class addmularray
	{
		public static void main(String[] args)
		{
			int i,n,sum=0,mul=1;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size of array :");
			n= sc.nextInt();
			int arr []=new int[n];
			System.out.println("Enter the elements of array :");
			for (i=0;i<n ;i++ ) 
			{
				arr[i]= sc.nextInt();
			}
			for (i=0;i<n ;i++ )
			{
				if(i%2==0)
				{					
					sum=sum+arr[i];
					
				}
				else
				{
					mul=mul*arr[i];
					
				}
			}
			System.out.println("sum =" +sum);
			System.out.println("mul =" +mul);
		}

	}
