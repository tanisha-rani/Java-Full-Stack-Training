package operatorsPrograms;

public class SalaryIncrement {
	public static void main(String [] args) {
		int rating= 3;
		int experience= 6;
		String indiscipline="yes";
		String Increment=((rating>4 && experience >5) || indiscipline=="NO") ? "Increment Eligible" :"not eligible for incremnet";
		System.out.println(Increment);
	}
}
