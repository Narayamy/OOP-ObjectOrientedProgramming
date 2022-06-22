
public class Monitor {
	// atributes
	private String name;
	private  String serialNumber;
	private double price;
	private int size;
    
    // constructor
    public Monitor(String name, String serialNumber, double price, int size){
		this.name=name;
		this.serialNumber=serialNumber;
		this.price=price;
		this.size=size;	
    }
    
   	// getter
    public String name(){
    	return name;
    }
    // getter
    public String serialNumber(){
    	return serialNumber;
    }
    // getter
    public double price(){
    	return price;
    }
    // getter
    public int size(){
    	return size;
    }
    
    //setter
    public void setPrice(double price){
    	this.price=price;
    }
    //setter
    public String toString(){
    
    	return "Name: " + name + ", " + serialNumber + ", " + price + ", " + size;
    }
    
  /*  public void display(){
    	System.out.println("Name: " + name + ", " + serialNumber + ", " + price + ", " + size);
    }
    */
}