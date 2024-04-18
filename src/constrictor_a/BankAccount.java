package constrictor_a;

public class BankAccount {
	
	String accountNumber;
	double balance;
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public double deposite(double depositeAmount) {
		
		return balance = balance + depositeAmount;
		
	}
	
	
	
	public double withdrow(double withdrowAmount) {
		
		return balance = balance -  withdrowAmount;
		
	}
	
	
	
	

}
