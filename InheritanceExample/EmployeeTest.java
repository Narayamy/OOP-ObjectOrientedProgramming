/**
 * @(#)EmployeeTest.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */


public class EmployeeTest {

	public static void main(String[] args) {
	 Employee emp1 = new Employee("Rory","083124555","0021345D");
	 emp1.display();
	 
	 PartTimeEmp emp2 = new PartTimeEmp("Donal","0871234567","1111122K",6.50);
	 emp2.setHoursWorked(25);
	 emp2.paySlip();
	 
	 FullTimeEmp emp3 = new FullTimeEmp("David","0851111111","4445752H",24000);
	 emp3.paySlip();

	}
}