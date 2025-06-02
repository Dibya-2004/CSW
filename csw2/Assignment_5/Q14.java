package Assignment_5;
import java.io.*;
import java.util.Scanner;  

public class Q14 {  
    public static void main(String[] args) {  
    	Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the source file path: ");  
        String sourcePath = sc.nextLine();  
        File sourceFile = new File(sourcePath);  
        if (!sourceFile.exists()) {  
            System.out.println("Source file does not exist or is not a valid file.");  
            return;  
        }  
        System.out.print("Enter the destination file path: ");  
        String destPath = sc.nextLine();  
        File destFile = new File(destPath);  
        if (destFile.exists()) {  
            System.out.print("file exists. Overwrite? (yes/no): ");  
            if (!sc.nextLine().equalsIgnoreCase("yes")) {  
                System.out.println("Copy  cancelled.");  
                return;  
            }  
        }  
        try (FileInputStream fis = new FileInputStream(sourceFile);
        		FileOutputStream fos= new FileOutputStream(destFile)){
        	byte[] by=new byte[1024];
        	int i;
        	while((i=fis.read(by))!=-1) {
        		fos.write(by,0,i);
        	}
        	System.out.println("copy done");
        }catch(IOException e) {
        	System.out.println("error "+e.getMessage());
        	}
            sc.close();
    }  
}