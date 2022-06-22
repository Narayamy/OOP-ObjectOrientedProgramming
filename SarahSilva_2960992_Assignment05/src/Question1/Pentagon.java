/**
 * Class Name: Pentagon
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */

package Question1;

public class Pentagon extends Shape {
	private double side;
	private double height;

	// Constructor
	public Pentagon(String name, double side, double height) {
		super(name);
		this.side = side;
		this.height = height;
	}
	
	// return the area of the Pentagon
	public double area() {
		return 2.5*side*height;
	}
	
	// return the perimeter of the Pentagon
	public double perimeter() {
		return 5*side;
	}

}
