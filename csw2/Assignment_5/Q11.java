package Assignment_5;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("diary.txt");

        if (f.exists()) {
            System.out.println("New entries will be appended.");
        } else {
            System.out.println("New diary file created.");
        }

        System.out.println("Enter your diary entry:");
        String entry = sc.nextLine();
        sc.close();

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String s = dt.format(LocalDateTime.now());

        try (FileWriter w = new FileWriter(f, true)) {
            w.write("\n[" + s + "]\n" + entry + "\n");
            System.out.println("Journal entry saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
