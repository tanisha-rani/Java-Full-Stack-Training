package OOPsPractice;

public class BankAccount {
	int accNo;
	private double balance;
	
	BankAccount(){
		
	}
	BankAccount(int accNo, double balance){
		this.accNo=accNo;
		this.balance=balance;
		
	}
	public void setBalance(double balance) {
		this.balance=balance;
		
	}
	public double getBalance() {
		return balance;
	}
	double amount = 0.0;
	public double deposit(double balance) {
		
		return (amount+balance);
		
		
	}
	public String withdraw(double amount) {
		if(balance>=amount) {
			return "Withdraw possible";
		}
		return "Withdraw not possible";
	}
	
}
