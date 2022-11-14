//4.Find 2nd greater number;
package Problems_of_Lab_1;

import java.util.Scanner;
public class Problem4 {
           public static void main(String[] args){
               Scanner input=new Scanner(System.in);
               int x,y,z;
               System.out.print("Enter your 1st Number: ");
               x=input.nextInt();
               System.out.print("Enter your 2nd Number: ");
               y=input.nextInt();
               System.out.print("Enter your 3rd Number: ");
               z=input.nextInt();
               
               if((x>y && x<z) || (x>z && x<y))
                   System.out.println("The 2nd greater number is : " +x);
             else if((y>x && y<z) || (y>z && y<x))
                   System.out.println("The 2nd greater number is : " +y);
               else
                   System.out.println("The 2nd greater number is : " +z);
           }    
}
