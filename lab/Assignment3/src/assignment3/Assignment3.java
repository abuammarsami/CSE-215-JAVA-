
package assignment3;

import java.util.Scanner;


public class Assignment3 {

   
    public static void main(String[] args) {
        
        System.out.print("Enter the radius: ");
        Scanner input=new Scanner(System.in);
        double r=input.nextDouble();
        
        Circle obj=new Circle();
       
        obj.setRadius(r);
        
        obj.getRadius();
        int numberOfObjects =obj.getNumberOfObjects();
        System.out.println("Total object  = "+numberOfObjects);
        double area=obj.getArea();
        
        System.out.println("Area = "+area);
        
        

    }

   
    
}
