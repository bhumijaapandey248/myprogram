/*
	n=24165
	sum= 12
	mul= 5
*/
import java.util.Scanner;
class eNdigitsum
{
	public static void main(String[] args)
	{
		int n,sum=0,mul=1,r;
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the value of n :");
		n= sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			if(r%2==0)
			{
				sum=sum+r;
			}
			else
			{
				mul=mul*r;
			}
			n=n/10;
		}
		
		System.out.println("sum of even numbers :" +sum);
		System.out.println("multiple of odd numbers :" +mul);
	}

}