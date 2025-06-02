package Assignment_5;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter a char to search:");
        char ch = sc.next().charAt(0);
        int first = str.indexOf(ch);
        int last = str.lastIndexOf(ch);
        System.out.println("Array: " +Arrays.toString(str.toCharArray()));
        System.out.println("1st occurre: " + first);
        System.out.println("Last occurre: " + last);
    }
}