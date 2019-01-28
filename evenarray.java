/*
	arr ={2 4 1 5 3 7}
	
	addition of even numbers =
	(2+4)=6

	multipication of odd numbers =
	(1*5*3*7)=105
*/

import java.util.Scanner;
class evenarray
{
	public static void main(String[] args)
	{
		int i,n ,add=0,mul=1;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the size of array :");
		n= sc.nextInt();
		int arr[]=new int[n]; /* */
		System.out.print("Enter the array elements :");
		for(i=0;i<n;i++)
		{
			arr[i]= sc.nextInt(); /* */
		}
		for (i=0;i<n ;i++ ) 
		{
			if(arr[i]%2==0)
			{
				add=add+arr[i];	/* */

			}
			else
			{
				mul=mul*arr[i];
			}
		}
		System.out.println("addition of even numbers :" +add);
		System.out.println("multiplication of odd numbers :"+mul);
	}
}