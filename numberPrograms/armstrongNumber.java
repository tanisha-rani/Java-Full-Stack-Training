package numberPrograms;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;

        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;   
        int sum = 0;

        while (temp != 0) {
            int res = temp % 10;
            sum = sum + (int) Math.pow(res, count);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("The number is ARMSTRONG");
        } else {
            System.out.println("The number is NOT ARMSTRONG");
        }

        sc.close();
    }
}
