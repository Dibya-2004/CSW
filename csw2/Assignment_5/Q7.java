package Assignment_5;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        System.out.println("Enter word to search:");
        String str2 = sc.nextLine();
        System.out.println("Enter word to replace with:");
        String r = sc.nextLine();

        String s = str.replaceFirst(str2, r);

        System.out.println("Original: " + str);
        System.out.println("Modified: " + s);

    }
}