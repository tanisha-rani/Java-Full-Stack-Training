package operatorsPrograms;

public class SpeedLimit {
	public static void main(String[] args) {
		int speed= 80;
		String service="rash driver";
		String fine=( speed>60 && service != "Emergency" )? "Fine imposed" :"No fine will be imposed";
		System.out.println(fine);
		int fineAmount= (fine=="Fine imposed")? 500: 0;
		System.out.println(fineAmount);
		
	}
}
