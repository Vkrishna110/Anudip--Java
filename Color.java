import java.util.*;
class Color {  
public static void main(String[] args) {  

    Scanner scan= new Scanner(System.in);
    System.out.println("to choose a color and enter a number");
    int c=scan.nextInt();
    switch(c){    
    case 1: 
        System.out.println("RED");  
        break;  
    case 2: 
        System.out.println("Orange");  
        break; 
    case 3: 
        System.out.println("Green");  
        break;
    case 4:
        System.out.println("yellow");
        break;
    default:
        System.out.println("enter a number between 1-- 4");  
    }  
}  
}  