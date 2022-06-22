/*
 * Class: TicketManager
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 *
 *
 */

class TicketManager{
	private Ticket[] tickets;
	private int sold = 0;
	private int maxTickets = 30;

	// Constructor to create an array of size maxTickets
	TicketManager(){
		this.tickets = new Ticket [maxTickets];
	}

	// Add the ticket to the next available slot in the list
	public boolean buy(Ticket t){
		if(sold<maxTickets){
			tickets[sold] = t;
			sold++;
			return true
		}
		else{
			return false
		}
	}

	// Generate and add the ticket to the next available slot in the list
	public boolean buy(){
		if(sold<maxTickets){
			// Create new instance of the Ticket object
			tickets[sold] = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));;
			sold++;
			return true
		}
		else{
			return false
		}
	}

	// Count how many tickets match the winning ticket drawn
	public int freqWinner(Ticket t){
		
	}

	//Return a list of all tickets that match the winning ticket drawn
	//Do not break encapsulation!
	public Winner[] getWinners(Ticket t){
		
	}

	// return true if a matching ticket is in the list
	public boolean search(Ticket t){
		
	}

	// return The number of tickets sold
	public int sold(){
		return sold;
	}

	// Return true if all tickets have been sold
	public boolean allsold(){
		if(sold==maxTicket){
			return true;
		}
		else{
			return false;
		}
	}

	public String toString(){
		if(sold == 0)
			return "[]";

		String s = "[";
		for(int j = 0; j < sold - 1; j++) {
			s = s + tickets[j] + ",";
		}
		return s+tickets[sold-1]+"]";
	}
}