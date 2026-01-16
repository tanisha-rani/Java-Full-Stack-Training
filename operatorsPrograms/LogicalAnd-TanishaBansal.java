package operatorsPrograms;

public class LogicalAnd {
    public static void main(String[] args) {
        int num = 15;

        String result = (num % 3 == 0 && num % 5 == 0)
                ? "Divisible by both 3 and 5"
                : (num % 3 == 0)
                    ? "Only divisible by 3"
                    : (num % 5 == 0)
                        ? "Only divisible by 5"
                        : "Not divisible by 3 or 5";

        System.out.println(result);
    }
}
