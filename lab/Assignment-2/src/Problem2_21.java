//2.21-Program to find future investment value
import static java.lang.Math.pow;
import java.util.Scanner;


public class Problem2_21 {
     public static void main(String[] args){
          Scanner input=new Scanner(System.in);
     double investmentAmount,monthlyInterestRate,numberOfYears,futureInvestmentValue;
     System.out.print("Enter investment amount : ");
     investmentAmount=input.nextDouble();
     System.out.print("Enter monthly interest rate : ");
     monthlyInterestRate=input.nextDouble();
     System.out.print("Enter number of years : ");
     numberOfYears=input.nextDouble();
     
     futureInvestmentValue = investmentAmount *pow((1+monthlyInterestRate),(numberOfYears*12.00));
     
     System.out.println("Accumulated value is  $"+futureInvestmentValue);
    
}
}