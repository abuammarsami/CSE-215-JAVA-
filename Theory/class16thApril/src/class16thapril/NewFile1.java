
package class16thapril;

import java.io.File;


public class NewFile1 {
    
    public static void main(String[] args) {
        
        File file= new File("maker");
        System.out.println(file.exists());
        file.mkdirs();
        System.out.println(file.exists());
        
        
    }
    
}
