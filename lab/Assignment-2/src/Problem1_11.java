//1.11-Program to show the population;
import java.util.Scanner;
public class Problem1_11 {
    public static void main(String[] args) {
        
        System.out.print("Enter the current population: ");
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();    
        double Births_in_a_year,Deaths_in_a_year,Imigrants_in_a_year;
        
        Births_in_a_year=(365*86400)/7.0;
        System.out.println("Births in a year is= " +Births_in_a_year);        
        Deaths_in_a_year=(365*86400)/13.0;
        System.out.println("Deaths in a year is = " +Deaths_in_a_year);
        Imigrants_in_a_year=(365*86400)/45.0;
        System.out.println("Imigrants in a year is = " +Imigrants_in_a_year);
        
        double population_in_a_year;        
        population_in_a_year = n+Deaths_in_a_year-Births_in_a_year+Imigrants_in_a_year;
        System.out.println("Total population in a year is = " +population_in_a_year);
        int i;
        double p;
        
        for (i=1;i<=5;i++)
        {
            p= i*5*population_in_a_year;
            System.out.println("Population in next 5 year is = " +p);
        }        
}
}
