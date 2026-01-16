package operatorsPrograms;

public class BonusPoints {
	public static void main(String [] args) {
		int score= 200;
		String level = "Passed";
		String EligibleForBonus= (score>=100 && level=="Passed") ? "Eligible for bonus":"Not eligible for Bonus";
		System.out.println(EligibleForBonus);
		int bonus= (EligibleForBonus =="Eligible for bonus")? (score + (10% score)): score;
		System.out.println(bonus);
		
	}
}
