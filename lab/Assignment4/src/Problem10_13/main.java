/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem10_13;

/**
 *
 * @author Acer
 */
public class main {
    public static void main(String[] args) {
		// Create a MyRectangle2D object
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

		// Display results
		System.out.println("\nRectangle:");
		System.out.println("Area: " + r1.getArea());
		System.out.println("Perimeter: " + r1.getPerimeter());
		System.out.println((r1.contains(3, 3) ? "Contains" : "Does not contain") + 
			" the point (3, 3).");
		System.out.println(
			(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)) ? "Contains" : 
				"Does not contain") + " the rectangle with points (4, 5, 10.5, 3.2)");
		System.out.println(
			(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) ? "Overlaps" : 
			"Does not overlap") + " the rectangle with points (3, 5, 2.3, 5.4)");
	}
}
    

