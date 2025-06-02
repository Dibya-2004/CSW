package Assignment_3;
public class Q1 {
    public static void main(String[] args) {
        String a = "abc123xyz456";
        try {
            extractAndDisplay(a);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void extractAndDisplay(String a) {
        if (a == null || a.isEmpty()) {
            throw new NullPointerException("Input string cannot be null or empty");
        }
        boolean foundNos = false;     
        for (char c : a.toCharArray()) {
            if (c>='0'&& c<= '9') {
                System.out.print(c);
                foundNos = true;
            }
        }
        if (!foundNos) {
            System.out.println("No numeric characters found in the string.");
        } else {
            System.out.println();
        }
    }
}
