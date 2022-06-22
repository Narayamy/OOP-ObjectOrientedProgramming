
public class PC {
	
	// atributes
	private String makeOf;
	private String processorType;
	private int RAM;
	private int hardDrive;
	private double price;
	
	// constructor
	public PC(String makeOf, String processorType, int RAM, int hardDrive, double price){
		this.makeOf = makeOf;
		this.processorType = processorType;
		this.RAM = RAM;
		this.hardDrive = hardDrive;
		this.price = price;
	}
	
	// getters, retrieve the current value of the attributes
	public String makeOf(){
		return makeOf;
	}
	public String processorType(){
		return processorType;
	}
	public int RAM(){
		return RAM;
	}
	public int HardDrive(){
		return hardDrive;
	}
	public double price(){
		return price;
	}
	
	// setter, change the price of the PC
	public void setPrice(double price){
		this.price = price;
	}
    
    // display
    public void display(){
    	System.out.println("Computer info: " + makeOf + ", " + processorType + 
    		", " + RAM + "GB, " + hardDrive + "GB, price: €" + price);
    	System.out.println();
    }
    
}