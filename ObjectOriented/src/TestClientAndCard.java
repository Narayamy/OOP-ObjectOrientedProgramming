
public class TestClientAndCard {
	
	public static void main(String[] args) {
		
		Client c = new Client();
		CreditCard cdc = new CreditCard (111111);
		
		c. name = " Rafael Cosentino ";
		c. code = 123;
		
		cdc . expireDate = " 12/12/18 ";
		
		System . out. println (" Dados do cliente ");
		System . out. println (" Nome : " + c. name );
		System . out. println (" C�digo : " + c. code );
		
		System . out. println (" ----------------------------------------");
		
		System . out. println (" Dados do cart�o ");
		System . out. println (" N�mero : " + cdc . number );
		System . out. println (" Data de validade : " + cdc . expireDate );
		
		System . out. println (" ----------------------------------------");
		
		cdc . client = c;
		
		System . out. println (" Dados do cliente obtidos atrav�s do cart�o ");
		System . out. println ( cdc. client . name );
		System . out. println ( cdc. client . code );
	}
}
