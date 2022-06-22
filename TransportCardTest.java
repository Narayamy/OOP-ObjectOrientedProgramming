

public class TransportCardTest {

    public static void main(String[] args) {
    	TransportCard tc = new TransportCard("Sarah", 20);
    	tc.display();
    	System.out.println();
    	tc.deduct(5.4);
    	tc.display();
    	tc.add(20);
    	tc.display();
    	
    }
       
}