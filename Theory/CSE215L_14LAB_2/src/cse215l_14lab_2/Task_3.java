/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse215l_14lab_2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Task_3 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n1,n2,n3;
        n1=inp.nextInt();
        n2=inp.nextInt();
        n3=inp.nextInt();
        
        if((n1>n2) && (n1>n3)){
            System.out.println("n1 is greatest and the number is : "+n1);
        }
        else if ((n2>n1) && (n2>n3)){
            System.out.println("n2 is greatest and the number is : "+n2);
        }
        else if ((n3>n1) && (n3>n2)){
            System.out.println("n3 is greatest and the number is : "+n3);
        }
        else{
            System.out.println("You have enterd all zero");
        }
        
    
}
}
