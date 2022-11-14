//13.Find the value of a account after 6 month;
package Problems_of_Lab_1;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args){
        
        System.out.print("Enter your monthly saving amount: ");
        
        Scanner input=new Scanner(System.in);
        double n=input.nextDouble();
        
        
        double month1,month2,month3,month4,month5,month6;
        
        month1= n*(1+0.00417);
        month2= (n+month1) * (1+0.00417);
        month3= (n+month2) * (1+0.00417);
        month4= (n+month3) * (1+0.00417);
        month5= (n+month4) * (1+0.00417);
        month6= (n+month5) * (1+0.00417);
        
        System.out.println("After six month your account value is $" +month6);
        
        
    }
    
}
