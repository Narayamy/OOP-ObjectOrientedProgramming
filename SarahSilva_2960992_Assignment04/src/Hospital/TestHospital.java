/*
*
* Student Name: Sarah Narayamy Tavares Silva
* Student Number: 2960992
*
*
*/
package Hospital;

public class TestHospital {

	public static void main(String[] args) {
		
		// Testing class Person
		Person person1 = new Person("Sarah Narayamy Tavares Silva", "0838478897", 'F');
		System.out.println("###### Person ######");
		System.out.println(person1);
		System.out.println();
		System.out.println();
		
		// Testing class Patient
		Patient patient1 = new Patient("Sarah Narayamy Tavares Silva", "0838478897", 'F', "10", "B+");
		System.out.println("###### Patient ######");
		System.out.println(patient1);
		System.out.println();
		System.out.println();
		
		// Testing class Employee
		Employee employee1 = new Employee("Sarah Narayamy Tavares Silva", "0838478897", 'F', "10", "Marketing");
		System.out.println("###### Employee ######");
		System.out.println(employee1);
		System.out.println();
		System.out.println();
		
		Employee employee2 = new Employee("Darwin Stefano", "0835459852", 'M', "20", "IT");
		System.out.println("###### Employee ######");
		System.out.println(employee1);
		System.out.println();
		System.out.println();
		
		Employee employee3 = new Employee("Aline Fernandes", "0835452245", 'F', "30", "RH");
		System.out.println("###### Employee ######");
		System.out.println(employee1);
		System.out.println();
		System.out.println();
		
		Employee employee4 = new Employee("Paula Fernandes", "0835452458", 'F', "40", "Engenharia");
		System.out.println("###### Employee ######");
		System.out.println(employee1);
		System.out.println();
		System.out.println();
		
		// Test addEmployee method from Employee manager
		Employee emp1 = new Employee("Joe Bloggs", "0871234567", 'm', "1234E", "X-Ray");
		Employee emp2 = new Employee("Mary Smith", "0851112212", 'f', "1154A", "Oncology");
		Employee emp3 = new Employee("Sam Murphy", "061313131", 'm', "1158W", "Paediatrics");
		Employee emp4 = new Employee("Sarah Clarke", "0833333333", 'f', "1569P", "Cardiology");
		Employee emp5 = new Employee("Jane Doe", "0864564566", 'f', "1478S", "Oncology");
		Employee emp6 = new Employee("Should Cause Error", "0855555555", 'f', "1111S", "Oncology");
		
		EmployeeManager store = new EmployeeManager(5);
		boolean added = store.addEmployee(emp1);
		if(added == false) {
			errorCount++;
			System.out.println("Error #1: problem adding an Employee to the store");
			System.out.println();
		}
				
		store.addEmployee(emp2);
		store.addEmployee(emp3);
		store.addEmployee(emp4);
		store.addEmployee(emp5);
		// The store should now be full
		added = store.addEmployee(emp6);
		if(added == true) {
			errorCount++;
			System.out.println("Error #2: Should not be able to add a 4th Employee to the store");
			System.out.println();
		}
				
		// Test getEmpByGender method
		Employee[] empty = store.getEmpByGender('x'); // should be none
		if(empty.length != 0) {
			errorCount++;
			System.out.println("Error #3: Should be no employees with gender x");
			System.out.println();
		}
				
		Employee[] females = store.getEmpByGender('f'); // should be none
		if(females.length != 3) {
			errorCount++;
			System.out.println("Error #4: Should be 3 employees with gender f, actually is "+females.length);
			System.out.println();
		}
				
		// Test getEmpByDept method
		empty = store.getEmpByDept("Not there"); // should be none
		if(empty.length != 0) {
			errorCount++;
			System.out.println("Error #5: Should be no employees with dept 'Not there'");
			System.out.println();
		}
				
		Employee[] arr = store.getEmpByDept("Oncology");
		if(arr.length != 2) {
			errorCount++;
			System.out.println("Error #6: Should be 3 employees in the Oncology Department, actually is "+arr.length);
			System.out.println();
		}
				
		// Test getEmpByID method
		Employee nullEmp = store.getEmpByID("Not there"); // should be none
		if(nullEmp != null) {
			errorCount++;
			System.out.println("Error #7: Should be no employees with this employee ID");
			System.out.println();
		}
				
		Employee newEmp = store.getEmpByID("1234E");
		if(newEmp==null) {
			errorCount++;
			System.out.println("Error #8: Should be an employees with ID '1234E'");
			System.out.println();
		}
		System.out.println();
		if(!store.toString().equals("[EmployeeID: 1234E  Name: Joe Bloggs   Phone: 0871234567   "+
		"Gender: m  Department: X-Ray\nEmployeeID: 1154A  Name: Mary Smith   Phone: 0851112212"+
		"   Gender: f  Department: Oncology\nEmployeeID: 1158W  Name: Sam Murphy   "+
		"Phone: 061313131   Gender: m  Department: Paediatrics\nEmployeeID: 1569P  "+
		"Name: Sarah Clarke   Phone: 0833333333   Gender: f  Department: Cardiology\n"+
		"EmployeeID: 1478S  Name: Jane Doe   Phone: 0864564566   Gender: f  Department: Oncology]")) {
		errorCount++;
		System.out.println("Error #9: Employee details incorrect");
		System.out.println();
		}
				
		System.out.println();
		System.out.println("~~~");
		System.out.println(store.toString());
		System.out.println("~~~");
	}

}
