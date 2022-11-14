
package lab.pkgclass.pkg5;

import java.util.Scanner;
public class LabClass5 {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double n=input.nextDouble();
        
        Circle r=new Circle();
        r.radius=n;
        
        System.out.println("Area is "+r.getArea());
        System.out.println("Perimeter  is "+r.getPerimeter());
    }
    
}
