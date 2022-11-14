//10.Convert temperature;
package Problems_of_Lab_1;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        double c,f;
        System.out.print("Enter the temparature in celcius: ");
        c=input.nextDouble();
        f=(9/5)*c+32;
        System.out.println("The enterd temparature in fahrenheit is = " +f);
        
    }
    
}
