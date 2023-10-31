import java.util.*;
class Factorial
{
   
    public static void main(String[]args)
    {
       System.out.println("enter a number to find the factorial");
        Scanner scan=new Scanner(System.in);
       int num=scan.nextInt();
       int fact=1;
       for(int i=num;i>0;i--)
       {
        fact=fact*i;
       }
       System.out.println(fact);
    }
}    