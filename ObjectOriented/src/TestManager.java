
public class TestManager {

	public static void main(String[] args) {
		
		Manager g = new Manager ();
		g. salary = 1000;
		
		System . out. println (" Sal�rio : " + g. salary );
		
		System . out. println (" Aumentando o sal�rio em 10% ");
		g. raiseSalary ();
		
		System . out. println (" Sal�rio : " + g. salary );
		
		System . out. println (" Aumentando o sal�rio em 30% ");
		g. raiseSalary (0.3) ;
		
		System . out. println (" Sal�rio : " + g. salary );
	

	}

}
