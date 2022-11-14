//2.23-Program to find the cost of driving;
import java.util.Scanner;


public class Problem2_23 {
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        
        double DrivingDistance,miles_per_gallon,price_per_gallon,cost_of_driving;
        
        System.out.print("Enter the driving distance : ");
        DrivingDistance = input.nextDouble();
       
        System.out.print("Enter miles_per_gallon : ");
        miles_per_gallon = input.nextDouble();
        
        System.out.print("Enter price_per_gallon : ");
        price_per_gallon = input.nextDouble();
        
        cost_of_driving = (DrivingDistance/miles_per_gallon)*price_per_gallon;
        
        System.out.println("The cost of driving is  $"+cost_of_driving);
    
}
}