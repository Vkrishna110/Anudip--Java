import java.util.*;
class Armstrong
{
   
    public static void main(String[]args)
    {
       System.out.println("enter a number to check");
        Scanner scan=new Scanner(System.in);
       int num=scan.nextInt();
       int n=num;
       int sum=0;
       while(n>0)
       {
         int d=n%10;
         sum=sum+(d*d*d);
         n/=10;
       }
       if (sum==num)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}