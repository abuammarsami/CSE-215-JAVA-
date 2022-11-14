
public class JavaException {
    
    public static void main (String args[]){
        try {
            throw new MyException (2);
    }
        catch(MyException e){
            System.out.println(e);
        }
            
    
}
}
