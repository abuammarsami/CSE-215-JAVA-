//12.Program to find year and day by minutes;
package Problems_of_Lab_1;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args){
        System.out.print("Enter minutes to convert it into Years and days: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
        int minute=n;
        
        int year = 0;
        int day = 0;
        
        int one_day=24*60;
        int one_year=365*one_day;
        
        do
        {
            if (n>=one_year)
            {
                year = n/one_year;
                n = n%one_year;
            }
           if ((n>=one_day)&&(n<one_year))
            {
                day = n/one_day;
                
            }
            
        }while (n<one_day);
        
        
        System.out.println(+minute +" minutes is approximately "+year +" years and "+day +" days");
        
    }
    
}
