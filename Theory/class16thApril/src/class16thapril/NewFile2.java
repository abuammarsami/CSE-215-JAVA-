
package class16thapril;

import java.io.FileInputStream;


public class NewFile2 {
    public static void main(String[] args) {
        FileInputStream in= null;
        
        try {
            in = new FileInputStream("test.txt");
            int c ;
            
            while ((c = in.read()) != -1) {
            System.out.println(c);
        }
        }
            catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    }
    

