/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1821944642_md.abu_ammar;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class problem2main {
    public static void main (String[] args) {
        Scanner inp=new Scanner(System.in);
        try {
            System.out.println("Enter any two number: ");
             int a,b,c;
             a=inp.nextInt();
             b=inp.nextInt();
             c=a/b;
             System.out.println("result = " +c);
        } catch (ArithmeticException MyException) {
            System.out.println(MyException);
        }
    }
    
}
