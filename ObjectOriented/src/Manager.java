
public class Manager {
	
	public String name;
	public double salary;
	
	public void raiseSalary() {
		this.raiseSalary(0.1);
	}
	
	public void raiseSalary(double tax) {
		this.salary += this.salary*tax;
	}

}
