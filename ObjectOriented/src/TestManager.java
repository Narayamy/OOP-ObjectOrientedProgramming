
public class TestManager {

	public static void main(String[] args) {
		
		Manager g = new Manager ();
		g. salary = 1000;
		
		System . out. println (" Salário : " + g. salary );
		
		System . out. println (" Aumentando o salário em 10% ");
		g. raiseSalary ();
		
		System . out. println (" Salário : " + g. salary );
		
		System . out. println (" Aumentando o salário em 30% ");
		g. raiseSalary (0.3) ;
		
		System . out. println (" Salário : " + g. salary );
	

	}

}
