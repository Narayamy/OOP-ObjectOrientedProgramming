package Assignment10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyStackTestTest {
	
	MyStack<Book> books = new MyStack<Book>();

	@Test
	public void BookTest() {
		books.push(new Book("Dubliners","Joyce","fiction"));
    	books.push(new Book("The Committments","Doyle","fiction"));
    	books.push(new Book("Ulysses","Joyce","fiction"));
    	books.push(new Book("Discipline of Programming","Dijkstra","programming"));
    	books.push(new Book("Portrait","Joyce","fiction")); 
    	assertEquals(books.size(), 5);
	}
	@Test
	public void frequencyTest() {
		Book n1 = new Book("Dubliners","Joyce","fiction");
		books.push(n1);
    	books.push(new Book("The Committments","Doyle","fiction"));
    	books.push(new Book("Discipline of Programming","Dijkstra","programming"));
    	books.push(new Book("Portrait","Joyce","fiction")); 
    	books.push(n1);
    	assertEquals(books.frequency(n1), 2);
	}
	@Test
	public void topTest() {
		Book n1 = new Book("Dubliners","Joyce","fiction");
		books.push(n1);
    	books.push(new Book("The Committments","Doyle","fiction"));
    	books.push(new Book("Discipline of Programming","Dijkstra","programming"));
    	books.push(new Book("Portrait","Joyce","fiction")); 
    	books.push(n1);
    	assertEquals(books.top(), n1);
	}
	
	
	
}
