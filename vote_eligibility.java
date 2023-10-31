import java.util.Scanner;
public class Vote {
public static void main (String[] args)
{
	Scanner scan=new Scanner(System.in);
	int age=scan.nextInt();
    if(age>=16 && age<=18)
    {
       System.out.println("He/She is Eligible for voting"); 
    }
    else if(age<=15)
    {
        System.out.println("He/She is Not eligible for voting");
    }
    else if(age>=18)
    {
        System.out.println("He/She is not eligible for voting");
    }
}
}