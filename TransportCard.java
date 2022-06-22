

public class TransportCard {
	private String name;
	private double balance;	

	// constructor
    public TransportCard(String name, double balance) {
    	this.name = name;
    	this.balance = balance;
    }
    // getter
    public String name(){
    	return name;
    }
    // getter
    public double balance(){
    	return balance;
    }
    // setter
    public boolean deduct(double b){
    	if (balance<b){
    		return false;    		
    	}
    	else{
    		balance-=b;
    		return true;
    	}
    }
    public void add(double balance){
    	this.balance+=balance;
    }
    public void display(){
    	System.out.println("Name: " + name);
    	System.out.println("Balance: " + balance);
    }
    
    
}