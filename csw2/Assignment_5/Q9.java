package Assignment_5;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		File f = new File("diary.txt");
		if (f.exists()) {
            System.out.println("New entries will be appended");
        } else {
            System.out.println("New diary file created.");
        }
		System.out.println("Enter your diary entry:");
		String s=sc.nextLine();
		String dt=LocalDate.now().toString();
		try(FileWriter w= new FileWriter(f,true)) {
			w.write("\n"+dt+":\n"+s+"\n");
			System.out.println("Jornal Entry done");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
