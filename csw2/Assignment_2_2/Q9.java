package Assignment_2_2;
import java.util.HashSet;

public class Q9 {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 2, 5, 4, 9, 7, 6};
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        
        for (int num : array) {
            if (!a.add(num)) {
                duplicate.add(num);
            }
        }
        
        System.out.println("Repeating integers: " + duplicate);
    }
}
