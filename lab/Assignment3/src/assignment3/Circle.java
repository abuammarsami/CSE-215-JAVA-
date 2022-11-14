
package assignment3;


public class Circle {
    private double radius;
    
   private int numberOfObjects=0; 
   
   Circle()
   {
       numberOfObjects++;
   }
   Circle(double radius)
   {
       
   }
    
   public void getRadius()
   {
       System.out.println("Radius = "+radius);
   }
    public void setRadius(double radius)
    {
        this.radius =radius;
        
    }
    
    public int getNumberOfObjects()
    {
        return numberOfObjects;
    }
    public double getArea()
    {
        return (3.1416*radius*radius);
    }
}
