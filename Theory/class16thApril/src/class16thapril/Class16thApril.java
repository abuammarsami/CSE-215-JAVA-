
package class16thapril;

import java.io.File;
import java.io.IOException;


public class Class16thApril {

    
    public static void main(String[] args) {
       File file= new File("test.txt");
       System.out.println(file.exists());
       
       try {
           file.createNewFile();
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }
        System.out.println(file.exists());
    }
    
}
