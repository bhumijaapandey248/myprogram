import java.util.Scanner;
class maxNminArray
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter value of n :");
		int arr[] =new int[n];
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