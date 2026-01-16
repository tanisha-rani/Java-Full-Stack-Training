package operatorsPrograms;

public class Discount {
	public static void main(String[] args) {
		int amount=2500;
		String membership="Premium";
		int visits= 1;
		String discount= ((amount >=2000 && membership =="Premium") || visits >1) ? "Discount availed" :"Adiscount not availed";
		System.out.println(discount);
		int finalAmount= (discount=="Discount availed") ? (amount- 20% amount) :amount;
		System.out.println(finalAmount);
	}
}
