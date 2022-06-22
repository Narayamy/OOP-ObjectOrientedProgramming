/*
 * Class: TestTicketManager
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 *
 *
 */
import java.util.*;

public class TestTicketManager {

    public static void main(String args[]){
    	// create new instance of TicketManager
    	TicketManager tm = new TicketManager();
     	System.out.println(tm);
     	
     	// create new instance of Ticket
     	Ticket t1 = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));
     	tm.buy(t1);
     	System.out.println(tm);
     	
     	// create new instance of Ticket
     	Ticket t2 = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));
     	tm.buy(t2);
     	System.out.println(tm);
     	
     	for(int j = 0; j < 30; j++) {
     		tm.buy(new Ticket((int)(Math.random()*5),(int)(Math.random()*5)));
     	}
     	
     	System.out.println(tm.sold());
     	Ticket draw = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));
     	System.out.println(tm.freqWinner(draw));
    	
    }    
}