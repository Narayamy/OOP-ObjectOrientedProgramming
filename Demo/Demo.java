/**
 * @(#)Demo.java
 *
 *
 * @author 
 * @version 1.00 2018/9/25
 */


public class Demo{
	int value1;
	int value2;
	public Demo(){
	value1 = 10;
	value2 = 20;
	System.out.println("Inside Constructor");
	}

	public void display(){
		System.out.println("Value1: "+value1);
		System.out.println("Value2: "+value2);
	}
	
	// the main method would be in another class usually
	public static void main(String[] args){
		Demo d1 = new Demo();
		d1.display();
	}
}
