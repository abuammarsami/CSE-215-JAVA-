
package lab.pkgclass.pkg5;


public class Circle {
    double radius;
   

    Circle() {
        
    }

   
        
    
   double getArea(){
        return 3.1416*radius*radius;
    }
   double getPerimeter(){
       return 2*3.1416*radius;
   }
    void setRadius(double newRadius){
       newRadius=radius;
       
   }

  
    
}
