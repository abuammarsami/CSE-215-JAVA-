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
public class Task_4 {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        double C,F;
        System.out.println("Enter the Temparature in Celcius : ");
        C = inp.nextDouble();
        F=C*(9/5)+32;
        System.out.println("The converted temparature from Celcius to Farenhite is = "+F);
        
    }
    
}
