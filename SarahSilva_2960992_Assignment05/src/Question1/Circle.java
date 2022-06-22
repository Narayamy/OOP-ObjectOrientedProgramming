/**
 * Class Name: Circle
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */

package Question1;

public class Circle extends Shape {
	private double pi = 3.142;
	private double radius;

	// Constructor
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	// return the area of the circle
	public double area() {
		return pi*(radius*radius);
	}
	
	// return the perimeter of the circle
	public double perimeter() {
		return 2*pi*radius;
	}
	
	// return the diameter of the circle
	public double diameter(){
		return 2*radius;
	}

}
