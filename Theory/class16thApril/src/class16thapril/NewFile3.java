
package class16thapril;

import java.io.FileOutputStream;


public class NewFile3 {
     public static void main(String[] args) {
         FileOutputStream out = null;
         
         try {
             out = new FileOutputStream("test.txt");
             out.write('c');
             out.write('a');
             out.write('t');
         }
     catch(Exception  e)
     {
         System.out.println(e.getMessage());
     }
     } 
}
