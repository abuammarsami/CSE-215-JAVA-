//2.Detertine the greater number between two number;
package Problems_of_Lab_1;

import java.util.Scanner;

public class Problem2 {
 
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.print("Enter 1st Number: ");
        x=input.nextInt();
        System.out.print("Enter 2nd Number: ");
        y=input.nextInt();
        if (x>y)
        {
            System.out.println("The greater number is:" +x);
        }
        else
            System.out.println("The greater number is: " +y);
    }
}
