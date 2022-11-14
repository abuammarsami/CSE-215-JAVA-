
package labclass26feb;


public class Labclass26feb {

   
    public static void main(String[] args) {
       char[] ch={'j','a','v','a'};
      /* String s=new String(ch);
       String st= "Java";
       System.out.println(s +st);*/
    String s="java";
    String s2=s.concat("Python");
   System.out.println( s.concat("Python"));
    //s+="Python";
    System.out.println(s);
    
    System.out.println(s.hashCode());
    System.out.println(s2.hashCode());
    
    //System.out.println(s.charAt(-10));
    
    String s3="Test";
    String sf=String.format("HEllO %s ",s3); 
    System.out.println("String format : " +sf);
    
    }
    
    
    
    
}
