package Assignment_2_2;
import java.util.TreeSet;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(9);

        System.out.println("TreeSet elements: " + treeSet);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();
        System.out.println("Is " + num + " present? " + treeSet.contains(num));

        System.out.print("Enter a number to remove: ");
        int removeNum = scanner.nextInt();
        treeSet.remove(removeNum);
        System.out.println("TreeSet after removal: " + treeSet);

    }
}