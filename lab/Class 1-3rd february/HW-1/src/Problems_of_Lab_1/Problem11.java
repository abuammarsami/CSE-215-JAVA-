//11.Program to find Sum of all digit of a number;
package Problems_of_Lab_1;

import java.util.Scanner;


public class Problem11 {
    public static void main(String[] args){
        
        System.out.print("Enter any number between 1 to 1000: ");
        
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
        
        sum=a+c+e+g;
        
        System.out.println("ouput: "+sum);
    
}
}
