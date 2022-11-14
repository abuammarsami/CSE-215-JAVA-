//2.19-Programto find area of a triangle;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class Problem2_19 {
    public static void main(String[] args){
          Scanner input=new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3,d1,d2,d3;
        System.out.print("Enter <x1> <y1>: ");
        x1=input.nextDouble();
        y1=input.nextDouble();
        System.out.print("Enter <x2> <y2>: ");
        x2=input.nextDouble();
        y2=input.nextDouble();
        System.out.print("Enter <x3> <y3>: ");
        x3=input.nextDouble();
        y3=input.nextDouble();
         d1= sqrt(pow((x1-x2),2)-pow((y1-y2),2));
         d2= sqrt(pow((x2-x3),2)-pow((y2-y3),2));
         d3= sqrt(pow((x1-x3),2)-pow((y1-y3),2));
         
         double area,s;
         
         s=(d1+d2+d3)/2;
         area=sqrt(s*(s-d1)*(s-d2)*(s-d3));
         
         System.out.println("The area of the triangle is = " +area);
    }
}
