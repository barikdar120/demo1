package cum.cum;

public class Bank {
	
	int balance;
	public Bank(int b) {
	balance = b;
	}
	
	public int getBlance() {
		return balance;
	
	}
	public void deposit(int amount) {
		balance= balance+amount;
	}
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}
