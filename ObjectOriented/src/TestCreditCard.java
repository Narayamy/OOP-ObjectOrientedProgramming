
public class TestCreditCard {

	public static void main(String[] args) {
		
		CreditCard cdc1 = new CreditCard(111111);
		cdc1 . expireDate = " 01/01/2013 ";
		
		CreditCard cdc2 = new CreditCard (222222);
		cdc2 . expireDate = " 01/01/2014 ";
		
		System . out. println (" Dados do primeiro cart�o ");
		System . out. println (" N�mero : " + cdc1 . number );
		System . out. println (" Data de validade : " + cdc1 . expireDate );
		
		System . out. println (" ----------------------------------------");
		System . out. println (" Dados do segundo cart�o ");
		System . out. println (" N�mero : " + cdc2 . number );
		System . out. println (" Data de validade : " + cdc2 . expireDate );
	}

}
