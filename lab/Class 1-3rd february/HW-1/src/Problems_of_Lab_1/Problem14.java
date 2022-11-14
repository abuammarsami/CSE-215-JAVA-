//14.Calculate charges of a parking car;
package Problems_of_Lab_1;

import java.util.Scanner;


public class Problem14 {
   static double calculateCharges(int x)
    {
        if (x>3)
        {
            return (double) (2+x*0.50);
        }
        else return 2.00;
    }

    public static void main(String[] args){
        
        System.out.print("Enter how many hour you had been in the garage: ");
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
       double charges;
       
       charges= calculateCharges(n);
       
       if (charges>10.00)
       {
           charges = 10.00;
       }
       System.out.println("Youe charges is $" +charges );
    
}
}