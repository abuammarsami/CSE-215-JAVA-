//5.Find smallest number;
package Problems_of_Lab_1;

import java.util.Scanner;


public class Problem5 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter 1st Number: ");
        x=input.nextInt();
        System.out.print("Enter 2nd Number: ");
        y=input.nextInt();
        System.out.print("Enter 3rd Number: ");
        z=input.nextInt();
        if (x<y && x<z)
        {
            System.out.println("The smallest number is:" +x);
        }
        else if (y<x && y<z)
        {
            System.out.println("The smallest number is: " +y);
        }  
        else 
            System.out.println("The smallest number is: " +z);
    }
    
}
