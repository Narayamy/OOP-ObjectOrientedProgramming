public class EmployeeTest{
	
	public static void main(String[] EmployeeTest){
		
		// create an Email with both work and home email object
		Email email = new Email("sarah.silva@student.griffith.ie","sarahnarayamy@gmail.com");
		// create emaployee object (passing email in)
		Employee employee1 = new Employee("Silva","Sarah", email);
		
		// display employee object
		System.out.println("###### Employee ######");
		System.out.println(employee1);
		// edit email object
		email.setHomeEmail("sarahsilva@yahoo.com.br");
		// display showing that has changed
		System.out.println();
		System.out.println();
		System.out.println("###### Employee ######");
		System.out.println(employee1);
		//getting email from employee object again (using getter method)
		Email email2 = employee1.getEmails();
		// change this engine
		email2.setHomeEmail("sarahsilva@yahoo.com.br");
		// display again (showing it has changed again)
		System.out.println();
		System.out.println();
		System.out.println("###### Employee ######");
		System.out.println(employee1);
		
	}
}