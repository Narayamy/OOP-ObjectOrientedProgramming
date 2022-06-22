

public class Email {
	
	private String homeEmail;
	private String workEmail;

	public Email(String homeEmail, String workEmail){
		this.homeEmail = homeEmail;
		this.workEmail = workEmail;
	}
	
	// Getters
	public String getHomeEmail(){
		return homeEmail;
	}
	
	public String getWorkEmail(){
		return workEmail;
	}
	
	// Setters
	public void setHomeEmail(String homeEmail){
		this.homeEmail = homeEmail;
	}
	
	public void setWorkEmail(String workEmail){
		this.workEmail = workEmail;
	}
	
	public String toString(){
		return "Home email: " + homeEmail + "\nWork email: " + workEmail;
	}
	
	
}