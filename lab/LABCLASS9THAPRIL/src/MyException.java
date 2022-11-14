
public class MyException extends Exception {
    
    int a;
    
    MyException (int b) {
        a=b;
    }
    
    
    @Override
    public String toString() {
        return ("Exception Number = "+a );
    }
    
}
