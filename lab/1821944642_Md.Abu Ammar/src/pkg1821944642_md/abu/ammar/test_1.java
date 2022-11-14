
package pkg1821944642_md.abu.ammar;

import java.util.Scanner;


public class test_1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a,b,c,d,e,f;
       LinearEquation X=new LinearEquation();
       System.out.print("Enter the value of a,b,c,d,e,f");
       a=input.nextInt();
       b=input.nextInt();
       c=input.nextInt();
       d=input.nextInt();
       e=input.nextInt();
       f=input.nextInt();
       
       X.getValue(a,b,c,d,e,f);
       
       if(X.isSolvable()==true)
       {
           System.out.println("The solution of x="+X.getX());
           System.out.println("The solution of y="+X.getY());
       }
       else{
           System.out.println("The equation has no Solution");
       }
       
    }
            
    
}
