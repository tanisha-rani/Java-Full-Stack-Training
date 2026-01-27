package OOPsPractice;

public class bankAccountMethods {
	public static void main(String[] args) {
		BankAccount b1= new BankAccount(1,2000.0);
		b1.setBalance(2000.0);
		
		System.out.println("The account detalils are: "+b1.accNo+" "+b1.getBalance());
		
		System.out.println(b1.withdraw(25000.0));
		
		
		
	}
}
