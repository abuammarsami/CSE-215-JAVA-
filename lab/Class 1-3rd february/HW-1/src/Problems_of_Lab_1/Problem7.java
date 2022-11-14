//7.Find a number is multiple of another number;
package Problems_of_Lab_1;

import java.util.Scanner;


public class Problem7 {
    public static void main(String[] args){
         Scanner input=new Scanner(System.in);
        int x,y;
        System.out.print("Enter 1st Number: ");
        x=input.nextInt();
        System.out.print("Enter 2nd Number: ");
        y=input.nextInt();
        
        if(x%y==0)
            System.out.println("The number you entered 2nd is multipple of your 1st number");
        else
            System.out.println("The number you entered 2nd is not multipple of your 1st number");
    }
    
}
