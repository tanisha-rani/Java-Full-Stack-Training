package operatorsPrograms;

public class Stocks {
	public static void main(String [] args) {
		int quantity= 2;
		String status= "Hot Selling";
		String order= (quantity<10 && status == "Hot Selling")?"reorder" :"No reorder";
		System.out.println(order);
		int stocks= (order=="reorder") ? quantity+=quantity: quantity;
		System.out.println(stocks);
		
	}
}
