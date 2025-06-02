package Assignment_5;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Choose an operation:");
        System.out.println("1. Convert to lowercase");
        System.out.println("2. Convert to uppercase");
        System.out.println("3. Search for character index");
        System.out.println("4. Concatenate with another string");

        int c = sc.nextInt();
        sc.nextLine(); 

        switch (c) {
            case 1:
                System.out.println("Lowercase: " + str.toLowerCase());
                break;
            case 2:
                System.out.println("Uppercase: " + str.toUpperCase());
                break;
            case 3:
                System.out.println("Enter char to search:");
                char ch = sc.next().charAt(0);
                System.out.println("Index: " + str.indexOf(ch));
                break;
            case 4:
                System.out.println("Enter another string:");
                String concatStr = sc.nextLine();
                System.out.println("Concatenated: " + str.concat(concatStr));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}