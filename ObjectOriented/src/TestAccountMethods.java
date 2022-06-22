
public class TestAccountMethods {

	public static void main(String[] args) {
		
		Agency a = new Agency(123);
		
		Account c = new Account(a);
		
		System . out. println (" Chamando o método deposita passando o valor 1000 ");
		c. deposit (1000) ;
		c. printExtrato ();
		
		System . out. println (" ----------------------------------------");
		
		System . out. println (" Chamando o método saca passando o valor 100 ");
		c. withdraw (100) ;
		c. printExtrato ();
		
		System . out. println (" ----------------------------------------");
		
		double saldoDisponivel = c. consultAvailableBalance ();
		System . out. println (" SALDO DISPONÍVEL : " + saldoDisponivel );

	}

}
