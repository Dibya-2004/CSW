package Assignment_3;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String a = sc.nextLine();
        try {
            int n = Integer.parseInt(a);
            try {
                int r = 10 / n;
                System.out.println("The result of 10 divided by " + n + " is: " + r);
            } catch (ArithmeticException e) {
                System.out.println("Error");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid ");
        }
    }
}
