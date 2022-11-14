/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1821944642_md.abu_ammar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Problem3main {
      public static void main (String[] args) {
          Scanner inp= new Scanner(System.in);
          long a,b;
          a=inp.nextLong();
          b=inp.nextLong();
          
          Rational ob=new Rational(a,b);
          System.out.println("Numerator:" +ob.getN());
          System.out.println("Denomitor:" +ob.getD());
          System.out.println("Adding:" +ob.add());
          System.out.println("Subtracting:" +ob.subtract());
          System.out.println("Multiply:" +ob.multiply());
          System.out.println("Devide:" +ob.devide());
          System.out.println("GCD:" +ob.gcd());
          try{
          File file= new File ("test.txt");
          FileOutputStream f= new FileOutputStream(file);
          ObjectOutputStream o =new ObjectOutputStream(f);
          o.writeObject(ob);
          } catch(Exception e)
          {
              System.out.println(e);
          }
      }
}
