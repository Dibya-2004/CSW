package Assignment_2_2;
import java.util.HashMap;
public class Q10 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 5, 6};
        int missingNumber = findSmallestMissingPositive(arr);
        System.out.println("The smallest positive number missing is: " + missingNumber);
    }
    public static int findSmallestMissingPositive(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (num > 0 && num <= 10) {
                map.put(num, 1);
            }
        }
        for (int i = 1; i <= 10; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return 11;
    }
}
