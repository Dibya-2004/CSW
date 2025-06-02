package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int[] nos = {34, 12, 67, 89, 45, 23, 56, 78};
        System.out.println("Original Array: " + Arrays.toString(nos));
        Arrays.sort(nos);
        System.out.println("Sorted Array: " + Arrays.toString(nos));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int s = sc.nextInt();
        int index = binarySearch(nos, s);
        if (index != -1) {
            System.out.println("Found " + s + " at index: " + index);
        } else {
            System.out.println(s + " is not in the array.");
        }
        try {
            System.out.print("Enter an index to access: ");
            int i = sc.nextInt();
            System.out.println("Element at index " + i + ": " + nos[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter a valid index.");
        }
        try {
            System.out.println(nos[10]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an element beyond the array bounds.");
        }
    }
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
