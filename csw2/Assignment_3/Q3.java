package Assignment_3;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a numeric value: ");
        String a = scanner.next();
        try {
             Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid numeric value.");
           
        }
    }
}
