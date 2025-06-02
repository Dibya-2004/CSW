package Assignment_5;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("RCB");
        
        while (true) {
            System.out.println("\nStringBuilder Operations");
            System.out.println("1. Add a substring");
            System.out.println("2. Remove string");
            System.out.println("3. Modify at index");
            System.out.println("4. Concatenate another string at end");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter substring to add: ");
                    String s = sc.nextLine();
                    sb.append(s);
                    System.out.println("After append: " + sb.toString());
                    break;
                
                case 2:
                    System.out.print("Enter start index to delete: ");
                    int start = sc.nextInt();    
                    System.out.print("Enter end index to delete: ");
                    int end = sc.nextInt();
                    sc.nextLine();
                    if (start >= 0 && end <= sb.length() && start < end) {
                        sb.delete(start, end);
                        System.out.println("After delete: " + sb.toString());
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                
                case 3:
                    System.out.print("Enter index to modify (0 to " + (sb.length() - 1) + "): ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index >= 0 && index < sb.length()) {
                        System.out.print("Enter new character: ");
                        char newChar = sc.next().charAt(0);
                        sb.setCharAt(index, newChar);
                        System.out.println("After modify: " + sb.toString());
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                
                case 4:
                    System.out.print("Enter string to concatenate: ");
                    String t = sc.nextLine();
                    sb.append(t);
                    System.out.println("After concatenation: " + sb.toString());
                    break;
                
                case 5:
                    System.out.println("Current StringBuilder content: " + sb.toString());
                    break;
                
                case 6:
                    System.out.println("Exiting.....");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}