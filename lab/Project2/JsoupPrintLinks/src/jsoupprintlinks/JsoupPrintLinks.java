package jsoupprintlinks;
import java.util.Scanner;
import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;  
public class JsoupPrintLinks { 
    
     public static void main( String[] args ) throws IOException{ 
            Scanner S=new Scanner(System.in);
            System.out.println("Enter a Website Name: ");
            String Web=S.next();
            int count=0;
           
            Document doc = Jsoup.connect("http://"+Web).get();  
            Elements links = doc.select("a[href]");  
            for (Element link : links) {  
                System.out.println("\nlink : " + link.attr("href"));  
                count++; 
                 if(count==40)
                {
                    break;
                }
                
            }  
            if(count<40)
            {
                 
            for (Element link : links) {  
                System.out.println("\nlink : " + link.attr("href"));  
                count++;
                if(count==40)
                {
                    break;
                }
                
            } 
            }
             
            System.out.println("\nTotal Links "+count);
}  
}  