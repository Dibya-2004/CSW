package Assignment_5;
import java.io.File;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name to delete: ");
        String f = sc.nextLine();
        File file = new File(f);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully: " + f);
            } else {
                System.out.println("Failed to delete the file. Check file permissions.");
            }
        } else {
            System.out.println("File does not exist: " + f);
        }

    }

}