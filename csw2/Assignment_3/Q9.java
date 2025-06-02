package Assignment_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Please enter an integer: ");
            int n = sc.nextInt();
            System.out.println("You entered: " + n);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
    }
}
