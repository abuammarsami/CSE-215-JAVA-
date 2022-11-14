
package pkg1821944642_md.abu.ammar;


public class Circle2D {
    
    private double x,y,r;
    final double pi=3.1416;
    void getPoints(double x, double y){
        this.x=x;
        this.y=y;
    }
    void getRadius(double r){
        this.r=r;
         
    }
    Circle2D(){
        this.x=0;
        this.y=0;
        this.r=1;
    }
    Circle2D(double x,double y,double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }
    double getArea(){
        return pi*r*r;
    }
    double getPerimeter(){
        return ((4/3)*pi*r*r*r);
    }
    
    boolean contains(double x, double y){
        if(x)
    }
    
}
