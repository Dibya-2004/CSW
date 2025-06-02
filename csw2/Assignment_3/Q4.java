package Assignment_3;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        try {
            double r =  Math.sqrt(n);
            if(n<0) {
            	throw new ArithmeticException("invalid input");
            }
            System.out.println("The square root of " + n + " is: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }
    }
}
