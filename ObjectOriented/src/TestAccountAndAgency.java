
public class TestAccountAndAgency {

	public static void main(String[] args) {
		
		Agency a = new Agency(1234);
		Account c = new Account (a);
		
		c. number = 123;
		c. balance = 1000.0;
		c. limit = 500;
		
		System . out. println (" Dados da ag�ncia ");
		System . out. println (" N�mero : " + a. number );
		
		System . out. println (" ----------------------------------------");
		
		System . out. println (" Dados da conta ");
		System . out. println (" N�mero : " + c. number );
		System . out. println (" Saldo : " + c. balance );
		System . out. println (" Limite : " + c. limit );
		
		System . out. println (" ----------------------------------------");
		
		c. agencia = a;
		
		System . out. println (" Dados do ag�ncia obtidos atrav�s da conta ");
		System . out. println (c. agencia . number );

	}

}
