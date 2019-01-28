
import java.util.Scanner;
class Amstrongnumber {
    public static void main(String[] args) {
        int len=0 ,no;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        no= sc.nextInt();
        int t1=no;
        while(t1!=0)
        {
            t1=t1/10;
            len=len+1;
            
        }
        int t2=no,ams=0,r,i;
        while(t2!=0)
        {
            int mul=1;
            r=t2%10;
            for(i=1;i<=len;i++)
            {
                mul=mul*r;
                
            }
            ams=ams+mul;
            t2=t2/10;
            
        }
        if(ams==no)
        {
            System.out.println(" number is armstrong number ");
        }
        else
        {
            System.out.println(" number is not armstrong number ");
        }
  }
    
}