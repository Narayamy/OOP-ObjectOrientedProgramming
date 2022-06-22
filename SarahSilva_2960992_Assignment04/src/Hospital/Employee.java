/*
*
* Student Name: Sarah Narayamy Tavares Silva
* Student Number: 2960992
*
*
*/
package Hospital;

public class Employee extends Person {
	
	// Attributes
	private String employeeId;
	private String department;
	
	// Constructor
	public Employee(String name, String phoneNumber, char gender, String employeeId, String department) {
		super(name, phoneNumber, gender);
		this.employeeId = employeeId;
		this.department = department;
	}

	public String getEmployeeId() {
		return getName() + employeeId;
	}

	public String getDepartment() {
		return getPhoneNumber() + getGender() + department;
	}

	@Override
	public String toString() {
		return "Employee ID: " + employeeId + "\n" + super.toString() + "\nDepartment: " + department;
	}

}
