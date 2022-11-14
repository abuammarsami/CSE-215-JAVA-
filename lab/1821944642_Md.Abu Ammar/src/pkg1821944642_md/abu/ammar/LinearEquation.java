
package pkg1821944642_md.abu.ammar;


public  class LinearEquation {
    private int a,b,c,d,e,f;
    
    void getValue(int a,int b,int c,int d,int e, int f){
       
       this.a=a;
       this.b=b;
       this.c=c;
       this.d=d;
       this.e=e;
       this.f=f;   
    }
   boolean isSolvable(){
        return a*d-b*c!=0;
   }
   double getX(){
       double x;
       x=(e*d-b*f)/(a*d-b*c);
       return x;
   }
   double getY(){
       double y;
       y=(a*f-e*c)/(a*d-b*c);
       return y;
   }
   
    
    
}
