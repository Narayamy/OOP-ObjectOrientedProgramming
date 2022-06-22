/*
 * Class: MyStack.java
 *
 * Student name: Sarah Narayamy Tavares Silva
 * Student number: 2960992
*/

package Assignment10;

import java.util.*;
import java.util.LinkedList;

public class MyStack<Book> {
	
	private LinkedList<Book> myStack;
	private int stackSize = 0;
	
	public MyStack() {
		myStack = new LinkedList<Book>();
	}
	
	public boolean stackEmpty() {
		if(stackSize == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean stackFull() {
		return false;
	}
	
	public Book pop() {
		if(stackEmpty()) {
			System.out.println("Stack Empty!!!");
			return null;
		}
		else {
			stackSize--;
			Book temp = myStack.get(stackSize);
			myStack.remove(stackSize);
			return temp;
		}
	}
	
	public void push(Book x) {
		if(stackFull()) {
			System.out.println("Stack Full!!!");
		}
		else {
			myStack.add(x);
			stackSize++;
		}
	}
	
	public int size() {
		return myStack.size();
	}
	
	public boolean search(Book x) {
		return myStack.contains(x);
	}
	
	public Book top() {
		Book top = myStack.peek();
		return top;
	}
	
	public int frequency(Book x) {
		int count = 0;
		Book z = null;
		Iterator<Book> it = myStack.iterator();
		while(it.hasNext()) {
			z = it.next();
			if(z.equals(x)) {
				count++;
			}
		}
		return count;
	}
	
	/*public boolean equals(E x) {
		
		
	}*/

	@Override
	public String toString() {
		return myStack.toString();
	}
	
}
