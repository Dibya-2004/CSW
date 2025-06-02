package Assignment_5;
import java.io.File;
import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the current file name (with path if not in the same directory): ");
        String s = sc.nextLine();
        System.out.print("Enter the new file name: ");
        String f = sc.nextLine();
        File o = new File(s);
        File n = new File(f);
        if (!o.exists()) {
            System.out.println("Error: The file does not exist.");
        } else if (n.exists()) {
            System.out.println("Error: A file with the new name already exists.");
        } else {
            if (o.renameTo(n)) {
                System.out.println("File renamed successfully to: " + f);
            } else {
                System.out.println("Error: File renaming failed.");
            }
        }
    }
}