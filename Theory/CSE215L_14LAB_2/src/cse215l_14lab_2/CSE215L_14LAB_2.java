
package cse215l_14lab_2;

import java.util.Scanner;


public class CSE215L_14LAB_2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter any two integer number : ");
        int n1 =inp.nextInt();
        int n2=inp.nextInt();
        int sum;
        double avg;
        sum=n1+n2;
        avg=(n1+n2)/2;
        
        System.out.println("Sum of two number = "+sum+"\nAverage of two number = "+avg);
    }
    
}
