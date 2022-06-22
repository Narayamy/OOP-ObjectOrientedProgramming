
public class MonitorTest {

    public static void main(String[] args) {
    	Monitor screen1 = new Monitor("Sarah", "132135sdas", 150, 24);
    	Monitor screen2 = new Monitor("Paula", "5473545asd", 200, 32);
    //	screen1.display();
    //	screen2.display();
    	System.out.println();
    	screen1.setPrice(250);
    	System.out.println(screen2);
    //	screen1.display();
    	screen2.setPrice(250);
    //	screen2.display();
    	
    }
       
}