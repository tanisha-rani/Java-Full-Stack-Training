package loopingStatements;
import java.util.*;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;

        do {
            System.out.println("Welcome");
            System.out.print("Do you want me to print again? (y/n): ");
            a = sc.next();   
        } while (a.equals("y"));

        sc.close();
    }
}
