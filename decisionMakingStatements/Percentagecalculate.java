package decisionMakingStatements;
import java.util.*;

public class Percentagecalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sci = sc.nextInt();
        int maths = sc.nextInt();
        int hindi = sc.nextInt();
        int sst = sc.nextInt();
        int eng = sc.nextInt();

        int sum = sci + maths + hindi + sst + eng;
        int percentage = (sum * 100) / 500;

        System.out.println("Total Marks: " + sum);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 95) {
            System.out.println("A++");
        } else if (percentage >= 90) {
            System.out.println("A+");
        } else if (percentage >= 85) {
            System.out.println("A");
        } else if (percentage >= 80) {
            System.out.println("B+");
        } else if (percentage >= 75) {
            System.out.println("B");
        } else if (percentage >= 70) {
            System.out.println("C+");
        } else if (percentage >= 65) {
            System.out.println("C");
        } else if (percentage >= 60) {
            System.out.println("D+");
        } else if (percentage >= 55) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        sc.close();
    }
}
