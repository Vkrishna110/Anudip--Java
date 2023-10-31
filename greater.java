import java.util.*;
class greater {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first number ");
        int n1=scan.nextInt();
        System.out.println("enter the second number ");
        int n2=scan.nextInt();
        if(n1>n2)
            System.out.println("the greatest number is--"+n1);
        else    
            System.out.println("the greatest number is---"+n2);
    }
}
