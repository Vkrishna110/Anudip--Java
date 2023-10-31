 import java.util.*;
 class fibnocci 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner (System.in);
        System.out.println("enter how many numbers you want fibnocci series");
        int num=scan.nextInt();
        int n1=0;
        System.out.print(n1);
        int n2=n1+1;
        System.out.print(n2);  
        for(int i=1;i<=num-2;i++)
        {
            int n3=n1+n2;
            System.out.print(n3);
            n1=n2;
            n2=n3;
        }
    }

}
