//Program to find average Acceleration;
import java.util.Scanner;


public class Problem2_9 {
 
     public static void main(String[] args) {
         
         System.out.print("Enter v0 and v1 and t : ");
         Scanner input=new Scanner(System.in);
        
         double v0,v1,t;
        v0=input.nextDouble();
        v1=input.nextDouble();
        t=input.nextDouble();
        
        double a;
        
        a=(v1-v0)/t;
        
         System.out.println("The average Acceleration is  = "+a);
     }
}
