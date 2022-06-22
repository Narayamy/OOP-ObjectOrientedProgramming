

public class Employee {
	    // Atributes
    	private String surname;
    	private String firstName;
    	private Email email;
    	
    public Employee(String surname, String firstName, Email email) {
    	this.surname = surname;
    	this.firstName = firstName;
    	// make sure the previous data is secure by creating a copy of the object
    	this.email = new Email(email.getWorkEmail(), email.getHomeEmail());
    }
    
    // getters
    public String getSurname(){
    	return surname;
    }
    public String getFirstName(){
    	return firstName;
    }
    
    // returns employee's full name
    public String fullName(){
    	return surname + ", " + firstName;
    }
    
    // returning both emails
    public Email getEmails(){
    	// making a copy of the email in the getter method
    	return new Email(email.getWorkEmail(), email.getHomeEmail());
    }
    
    // return only the home email
    public String homeEmail(){
    	return "Home email: " + email.getHomeEmail();
    }
    
    // return only the work email
    public String workEmail(){
    	return "Work email: " + email.getWorkEmail();
    }
    
    public String toString(){
		return "Employee: " + fullName() + ": \n" + getEmails();
	}
    
    
    
    
    
    
}