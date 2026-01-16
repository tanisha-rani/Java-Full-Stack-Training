package operatorsPrograms;

public class ExamTime {
	public static void main(String[] args) {
		int attendance= 85;
		String Condition="Normal";
		int time= 100;
		String ExtraTime=(attendance<60 || Condition != "Normal")? "Extra Time Given ":"No extra Time Given";
		System.out.println(ExtraTime);
		time= (ExtraTime=="Extra Time Given")? time+20 :time;
		System.out.println(time);
	}
}
