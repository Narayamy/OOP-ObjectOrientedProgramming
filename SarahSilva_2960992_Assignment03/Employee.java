/*
 * Class: Employee
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 *
 *
 */

public class Employee {
	private String ppsNumber;
	private String name;
	private double salary;	

    // Constructor
    public Employee(String ppsNumber, String name, double salary) {
    	this.ppsNumber = ppsNumber;
    	this.name = name;
    	this.salary = salary;
    	   	
    }
    
    // Getters
    public String getPpsNumber(){
    	return ppsNumber;
    }
    public String getName(){
    	return name;
    }
    public double getSalary(){
    	return salary;
    }
    
    // Setters
    public void setPpsNumber(String ppsNumber){
    	this.ppsNumber = ppsNumber;
    }
    public void setName(String name){
    	this.name = name;
    }
    public void setSalary(double salary){
    	this.salary = salary;
    }
    
    public void display(){
    	System.out.println();
    	System.out.println("######## Employee ########");
    	System.out.println("Employee name: " + name + "\nPPS Number: " + ppsNumber + "\nSalary: " + salary);
    	System.out.println();
    }
    
    
}