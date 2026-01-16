package numberPrograms;

import java.util.Scanner;

public class sunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;     
        int sum = 0;

        while (temp != 0) {
            int res = temp % 10;
            int factorial = 1;

            for (int i = res; i >= 1; i--) {
                factorial = factorial * i;
            }

            sum = sum + factorial;   
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("The number is STRONG");
        } else {
            System.out.println("The number is NOT STRONG");
        }

        sc.close();
    }
}
