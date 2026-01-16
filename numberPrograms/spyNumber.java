package numberPrograms;

import java.util.Scanner;

public class spyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;   

        int sum = 0;
        int product = 1;

        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + rem;
            product = product * rem;
            temp = temp / 10;
        }

        System.out.println("Sum of digits is " + sum);
        System.out.println("Product of digits is " + product);

        if (sum == product) {
            System.out.println("The number is SPY");
        } else {
            System.out.println("The number is NOT SPY");
        }

        sc.close();
    }
}
