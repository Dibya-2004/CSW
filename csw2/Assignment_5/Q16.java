package Assignment_5;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name (with path if not in the same directory): ");
        String f = sc.nextLine();
        File file = new File(f);
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Last Modified: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));
        } else {
            System.out.println("Error: The file does not exist.");
        }
    }

}