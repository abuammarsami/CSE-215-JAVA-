//2.18-Program to show the table of power and its elements;
import static java.lang.Math.pow;


public class Problem2_18 {
     public static void main(String[] args){
         
         System.out.println("a   b   pow(a , b)");
         
         int i,power;
         for(i=1;i<=5;i++)
         {
             
              power= (int) pow(i,i+1);
              System.out.println(+i +"   "+ +(i+1) +"   "+ +power);
         }
         
     }
    
}
