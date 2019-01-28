import java.util.Scanner;
class maxNminAarray
{
	public static void main(String[] args) 
	{
		
		int i,num;
		//int arr[]={4,7,9,4,2,6,3};
		Scanner input = new Scanner(System.in);

		System.out.println("enter size of array :");
		num= input.nextInt();

		int arr[] =new int[num];
		for (i=0;i<num ; i++)
		{
			System.out.println("enter the elements of array :");
			arr[num]= input.nextInt();	
		}
		
		int max=arr[0];
		int min =arr[0];
		int size=arr.length;
		for (i=0;i<=size ;i++ )
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
	/*	for(i=0;i<num;i++)
		{
		
		System.out.print("" + size);
		}*/
	}
}

