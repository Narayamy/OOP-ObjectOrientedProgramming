
public class TestAccountDefaultValues {

	public static void main(String[] args) {
		
		Agency a = new Agency(123);
		
		Account c = new Account (a);
		
		System . out. println (" Valores Padr�o ");
		System . out. println (" N�mero : " + c. number );
		System . out. println (" Saldo : " + c. balance );
		System . out. println (" Limite : " + c. limit );
		
	

	}

}
