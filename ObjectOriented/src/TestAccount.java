
public class TestAccount {

	public static void main(String[] args) {
		
		Agency a = new Agency(123);
		
		Account c1 = new Account (a);
		c1. number = 1234;
		c1. balance = 1000;
		c1. limit = 500;
		
		Account c2 = new Account (a);
		c2. number = 5678;
		c2. balance = 2000;
		c2. limit = 250;
		
		System . out. println (" Dados da primeira conta ");
		System . out. println (" Número : " + c1. number );
		System . out. println (" Saldo : " + c1. balance );
		System . out. println (" Limite : " + c1. limit );
		
		System . out. println (" ----------------------------------------");
		
		System . out. println (" Dados da segunda conta ");
		System . out. println (" Número : " + c2. number );
		System . out. println (" Saldo : " + c2. balance );
		System . out. println (" Limite : " + c2. limit );

	}

}
