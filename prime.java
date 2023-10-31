import java.util.*;
class Prime
{
    public static void main(String [] args)
	{
	int count=0;
        System.out.println("Enter a number to check");
        Scanner scan=new Scanner(System.in);
        int num = scan.nextInt();
        for (int i=1;i<=num;i++)
	{
            if (num % i == 0)
               count+=1;
    }
    if (count == 2)
        System.out.println("Its is a prime number");
    else
        System.out.println("Its is a  not prime number");
    } 
}