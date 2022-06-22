/*
 * Class: DepartmentTest
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 *
 *
 */
public class DepartmentTest {

    public static void main(String[] DepartmentTest){
    	
    	// create an employee object
		Employee employee1 = new Employee("1793907CA", "Sarah Narayamy Tavares Silva", 350.99);
		// create department object (passing employee in)
		Department dept1 = new Department("IT","0616437896", employee1);
		
		employee1.display();
		dept1.display();
		// change values
		employee1.setPpsNumber("18374637FA");
		employee1.setName("Paula Oehme");
		employee1.setSalary(356.99);
		// not supposed to change
		dept1.display();
		// supposed to change
		employee1.display();
		
		Department dept2 = new Department("IT", employee1);
		dept2.display();
		// change values
		employee1.setPpsNumber("18374637FA");
		employee1.setName("Paula Oehme");
		employee1.setSalary(356.99);
		// not supposed to change
		dept2.display();
		// supposed to change
		employee1.display();
    	
    }
    
    
}