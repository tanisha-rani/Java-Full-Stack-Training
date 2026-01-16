package operatorsPrograms;

public class TwoDIgitPositive {
	public static void main(String [] args) {
		int num=34;
		String result = (num>0 && (num >=10 && num<=99)) ? "Two  digit positive number" :"Not a two digit positive no";
		System.out.println(result);
	}
}
