
public class PCTest {

    public static void main(String[] args){
    	
    	// instances of PCs
    	PC computer1 = new PC ("HP", "Intel Celeron", 4, 64, 299);
    	PC computer2 = new PC ("Dell", "AMD", 6, 32, 315);
    	PC computer3 = new PC ("IMac", "Intel Core i7", 4, 48, 350);
    	
    	// call the display method from PC
    	computer1.display();
    	computer2.display();
    	computer3.display();
    	
    	// change the price of the computers
    	computer1.setPrice(250);
    	computer2.setPrice(350);
    	computer3.setPrice(300);
    	
    	// display new values
    	computer1.display();
    	computer2.display();
    	computer3.display();

    }    
}