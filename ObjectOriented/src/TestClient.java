
public class TestClient {
	
	public static void main(String[] args) {
	Client client = new Client();
	
	client.name = "Sarah Narayamy Tavares Silva";
	client.code = 3;
	
	System.out.println(client.name);
	System.out.println(client.code);
	
	client.name = "Paula Oehnme";
	client.code = 2;
	
	System.out.println(client.name);
	System.out.println(client.code);
	
	
	Client c1 = new Client();
	c1. name = " Rafael Cosentino ";
	c1. code = 1;
	Client c2 = new Client();
	c2. name = " Jonas Hirata ";
	c2. code = 2;
	System . out. println (" Dados do primeiro cliente ");
	System . out. println (" Nome : " + c1. name );
	System . out. println (" Código : " + c1. code );
	System . out. println (" ----------------------------------------");
	System . out. println (" Dados do segundo cliente ");
	System . out. println (" Nome : " + c2. name );
	System . out. println (" Código : " + c2. code );
	
	}
}
