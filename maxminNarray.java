/*
	arr={4 3 5 2 1 6}
	max=6
	min=1
*/
import java.util.Scanner;
class maxminNarray
{
	public static void main(String[] args) 
	{
		
		int  [] arr={4,3,5,2,1,6};
		int max=arr[0],i;
		int min =arr[0];
		for (i=1;i<arr.length ;i++ )
		 {
			if(max < arr[i])
			{
				max=arr[i];
			}
			if(min > arr[i])
			{
				min=arr[i];
			}	
		}
		System.out.print("maximum number :"+max);
		System.out.print("maximum number :"+min);
	}

}