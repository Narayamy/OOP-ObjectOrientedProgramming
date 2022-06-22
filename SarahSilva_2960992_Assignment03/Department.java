/*
 * Class: Department
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 *
 *
 */

public class Department {
	// Attributes
	private String deptName;
	private Employee manager;
	private String officeNumber;

	// Constructor to take in and set the 3 attributes
    public Department(String deptName, String officeNumber,Employee manager){
    	this.deptName = deptName;
    	this.officeNumber = officeNumber;
    	this.manager = new Employee(manager.getName(),
    		manager.getPpsNumber(), manager.getSalary());    	
    }
    
    // Constructor to take in the deptName & manager
    // and set the office phone number to ´-´
    public Department(String deptName,Employee manager){
    	this.deptName = deptName;
    	this.officeNumber = "-";
    	this.manager = new Employee(manager.getName(),
    		manager.getPpsNumber(), manager.getSalary());    	
    }
    
    // getters
    public String getDeptName(){
    	return deptName;
    }
    public String getOfficeNumber(){
    	return officeNumber;
    }
    public Employee getManager(){
    	// making a copy of manager in the getter method
    	return new Employee(manager.getName(), manager.getPpsNumber(), 
    		manager.getSalary());
    }
    
    // Setters
    public void setDeptName(String deptName){
    	this.deptName = deptName;
    }
    public void setOfficeNumber(String officeNumber){
    	this.officeNumber = officeNumber;
    }
    public void setManager(Employee manager){
    	this.manager = new Employee(manager.getName(),
    		manager.getPpsNumber(), manager.getSalary());
    }
    
    public void display(){
    	manager.display();
    	System.out.println("######## Department Information ########");
    	System.out.println("Department name: " + deptName + "\nOffice Number: " + officeNumber);
    	System.out.println();
    }
    
}