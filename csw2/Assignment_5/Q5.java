package Assignment_5;
import java.util.Scanner;
public class Q5 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter first string: ");
	        String str1 = sc.nextLine();
	        System.out.print("Enter second string: ");
	        String str2 = sc.nextLine();
	        
	        String lowerStr1 = str1.toLowerCase();
	        String lowerStr2 = str2.toLowerCase();
	        
	        boolean isEqual = lowerStr1.equals(lowerStr2);
	        
	        System.out.println("Converted first string: " + lowerStr1);
	        System.out.println("Converted second string: " + lowerStr2);
	        System.out.println("Are the strings equal (ignoring case)?: " + isEqual);
	        
	    }
}
