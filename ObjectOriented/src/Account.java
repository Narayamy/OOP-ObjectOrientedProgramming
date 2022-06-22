
public class Account {
	public int number;
	public double balance;
	public double limit = 100;
	public Agency agencia;
	
	public Account(Agency agencia) {
		this.agencia = agencia;
	}

	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value;
	}
	
	public void printExtrato() {
		System.out.println(" SALDO: " + this.balance);
	}
	
	public double consultAvailableBalance() {
		return this.balance + this.limit;
	}
	
	public void transfer(Account destine, double value) {
		this.balance -= value;
		destine.balance += value;
	}

}
