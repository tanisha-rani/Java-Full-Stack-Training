package Abstarction;

public  abstract class onlinePayment {
	public abstract void processPayment(double amount);
	public void printReceipt() {
		System.out.println("Payment Successfully done..!!   Print your Receipt");
	}
}
