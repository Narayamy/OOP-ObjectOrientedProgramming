/*
 Class Name: Shape
 
 Student Name: Sarah Narayamy Tavares Silva
 Student Number: 2960992
  
*/

package Question1;

abstract class Shape {
	private String name;

	// Constructor
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract double area();
	
	public abstract double perimeter();
	
	public void put(){
		System.out.printf("%s with area %6.2f and perimeter %6.2f\n",name, area(), perimeter() );
	}
	
	
}
