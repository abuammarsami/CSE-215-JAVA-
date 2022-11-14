//1.Program to read two integers from user and show some basic arithmatic operatrion;
import java.util.Scanner;


public class HW1 {

    
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int x,y,a,s,m,mo;
        double d;
        System.out.print("Enter any two number:");
        x=n.nextInt();
        y=n.nextInt();
        
        a=x+y;
        s=x-y;
        m=x*y;
        mo=x%y;
        d= (double) (x/y);
        System.out.println("Addition=" +a );
        System.out.println("Modulo= " +mo );
        System.out.println("Substraction=" +s );
        System.out.println("Multiplication=" +m );
        System.out.println("Division= " +d );
        
        
        
    }
    
}
