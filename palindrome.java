import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("enter anumber to check");
        int num=scan.nextInt();
        int n=num,res=0;
        while(n>0){
            int d=n%10;
            res=res*10+d;
            n=n/10;
        }
        if(res==num)
            System.out.println("Palindrome");
        else    
            System.out.println("not palindrome");
    }
}