//2.22-Program to show dollar and cents;
import java.util.Scanner;


public class Problem2_22 {
    public static void main(String[] args){
        
        System.out.print("Enter any four digit number: ");
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
        int a,b,c,d,e,f,g,h,sum,j;
        a=n%10;
        b=n/10;
        c=b%10;
        d=b/10;
        e=d%10;
        f=d/10;
        g=f%10;
        h=f/10;
        
        System.out.println("$"+g +e +" and "+ +c +a +" cents ");
    
}
}