
public class TestTransferMethod {

	public static void main(String[] args) {
		
		Agency a = new Agency (1234) ;
		
		Account origin = new Account (a);
		origin . balance = 1000;
		System . out. println (" Saldo da primeira conta : " + origin . balance );
		
		Account destine = new Account (a);
		destine . balance = 1000;
		System . out. println (" Saldo da segunda conta : " + destine . balance );
		
		System . out. println (" ----------------------------------------");
		
		System . out. println (" Realizando a transferência ");
		origin . transfer ( destine , 500) ;
		
		System . out. println (" ----------------------------------------");
		
		System . out. println (" Saldo da primeira conta : " + origin . balance );
		System . out. println (" Saldo da segunda conta : " + destine . balance );
		

	}
}
