/*
*
* Student Name: Sarah Narayamy Tavares Silva
* Student Number: 2960992
*
*
*/
package Hospital;

public class Person {
	
	// Attributes
	private String name;
	private String phoneNumber;
	private char gender;
	
	// Constructor
	public Person(String name, String phoneNumber, char gender) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}
	
	// Getters
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public char getGender() {
		return gender;
	}
	
	// To String to return the state of the class
	@Override
	public String toString() {
		return "Name: " + name + "\nPhone Number: " + phoneNumber + "\nGender: " + gender;
	}

}
