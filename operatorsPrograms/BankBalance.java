package operatorsPrograms;

public class BankBalance {
	public static void main(String[] args){
		int balance=500;
		String status= "active";
		String withdraw= (balance>0 && status=="active" ) ? "Withdrawal is Possible" :"No sufficeint amount to withdraw";
		System.out.println(withdraw);
	}
}
