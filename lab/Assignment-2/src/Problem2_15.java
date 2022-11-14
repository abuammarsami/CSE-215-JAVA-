//2.15-Program to find distance of two points;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class Problem2_15 {
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        double x1,y1,x2,y2,distance;
        System.out.print("Enter <x1> <y1>: ");
        x1=input.nextFloat();
        y1=input.nextFloat();
        System.out.print("Enter <x2> <y2>: ");
        x2=input.nextFloat();
        y2=input.nextFloat();
         distance=(float) sqrt(pow((x1-x2),2)+pow((y1-y2),2));
         
         System.out.println("The distace between your entered two points is  " +distance);
    
}
}
