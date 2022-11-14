
package classworkweek4.Staticpractice;


public class StaticPrctice {
    static int i=1;
    
    public static void main(String[] args){
        f();
        f();
        f();
        
    }
    
    static void f(){
        int j=1;
        i++;
        j++;
        System.out.println("i= "+i);
        System.out.println("j= "+j);
    }
}
