/**
 * @(#)Person.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */


public class Person {
	private String name;
	private String phone;
	public Person(String n, String p){
		name = n; phone = p;
	}
	public String getName(){ return name;}
	public String getPhone(){ return phone;}
	public void display(){
		System.out.println("Name   : "+name);
		System.out.println("Phone  : "+phone);
	}
}
