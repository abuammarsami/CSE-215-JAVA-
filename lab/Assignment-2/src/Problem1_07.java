//1.07-Program  to show two different series;

import java.util.Scanner;

public class Problem1_07 {

    public static void main(String[] args) {
       
        System.out.print("Enter the last number of the series: ");
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();
        
        int i;
        double s1,s2,s;
        
        s1=0;
        s2=0;
       
        System.out.print(4 +"*(");
        for (i=1;i<=n;i=i+4)
        {
            s1=s1+(1.0/i);
            System.out.print("1/"+ +i +" - ");
            
            s1=s1-(1.0/2+i);
             System.out.print("1/" +(i+2));
             if (i<n)
             {
              System.out.print(" + ");   
             }
        }
        s=s1*4;
        System.out.println(") = "+s );
        
        System.out.print(4 +"*(");
        for (i=1;i<=n+2;i=i+4)
        {
            s2=(s2+(1.0/i));
            System.out.print("1/"+ +i +" - ");
            
            if(i<n+2)
            {  
              s2=s2-(1.0/2+i);
              System.out.print("1/"+ +(i+2) +" + " );
            }
            
        }
         System.out.println(") = "+s2*4 );
        
    }
    
}
