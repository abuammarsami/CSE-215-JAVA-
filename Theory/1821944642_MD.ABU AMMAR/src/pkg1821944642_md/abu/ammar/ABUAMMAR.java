
package pkg1821944642_md.abu.ammar;

import java.util.Scanner;


public class ABUAMMAR {

 
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.print("Enter the first 9 digits of an ISBN as integer:");
     int n=input.nextInt();
     int temp=n;
     int r,s=0,d=9;
     while(n!=-1)
     {
         r=n%10;
         s=s+r*d;
         n=n/10;
         d--;
     }
     int checksum;
     checksum=s%11;
      if(checksum==10)
      {
          System.out.println("The ISBN-10 number is "+n +"X");
      }
      else 
          System.out.println("The ISBN-10 number is "+n +checksum);
     
    }
    
}
