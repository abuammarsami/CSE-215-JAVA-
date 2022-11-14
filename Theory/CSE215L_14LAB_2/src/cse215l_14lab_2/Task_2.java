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
public class Task_2 {
     public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
         int i,sum=0;
         int arr[] = new int[10];
         double avg;
         for(i=0;i<10;i++){
             System.out.println("Enter arr["+i+"]=");
             arr[i]=inp.nextInt();
         }
         for (i=0;i<10;i++){
             sum=sum+arr[i];
             
         }
         avg=sum/10;
         System.out.println("Sum of 10 number = "+sum+"\nAverage of 10 number = "+avg);
    
}
}