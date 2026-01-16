package operatorsPrograms;

public class ExamEligible {
	public static void main(String[] args) {
		int marks=54;
		int attendance= 78;
		String result= (marks >=40 && attendance >75) ? "Pass" : "Fail";
		System.out.println(result);
		marks =(result=="Pass") ? marks+5 : marks;
		System.out.println(marks);
	}
}
