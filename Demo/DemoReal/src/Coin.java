

public class Coin {

   String name;
   String value;
   int year;
   String shape;
   
   public Coin(String name, String value, int year, String shape){
		this.name = name;
		this.value = value;
		this.year = year;
		this.shape = shape;
	}
	
	public void display(){
		System.out.println("##### Welcome #####");
		System.out.println("Name: "+ name);
		System.out.println("Value: " + value + " From: " + year);
		System.out.println("Shape: " + shape);
		System.out.println();
	}
    
    
}