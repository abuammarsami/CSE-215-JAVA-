//6.Check Even or Odd;
package Problems_of_Lab_1;

import java.util.Scanner;


public class Problem6 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x;
        System.out.print("Enter a Number to check if it is Odd or Even: ");
        x=input.nextInt();
        if(x%2==0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
        
    }
    
}
