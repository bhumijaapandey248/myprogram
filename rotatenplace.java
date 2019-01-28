import java.util.Scanner;
class rotatenplace
{
	public static void main(String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		n= sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter array elements :");
		for (i=0;i<n ;i++ ) 
		{
			arr[i]= sc.nextInt();	
		}
		int temp,j=n-1;
		while(i<j)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		
		//arr[0]=temp;
		 for(i=0;i<n;i++)
		 {
			System.out.print(""+ arr[i]);	
		}
	}
}