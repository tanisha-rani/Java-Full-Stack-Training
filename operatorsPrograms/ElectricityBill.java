package operatorsPrograms;

public class ElectricityBill {
	public static void main(String[] args) {
		int units=200;
		String Type=" Personal";
		int tax= 250;
		
		int bill=(units >=300 && Type=="Commercial") ? units*14+ tax: units * 7;
		System.out.println(bill);
	}
}
