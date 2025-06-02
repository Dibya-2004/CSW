package Assignment_3;

class CustomNullPointerException extends Exception {
  CustomNullPointerException(String message) {
     super(message);
 }
}
public class Q2 {

 public static void main(String[] args) {
     try {
         NullPointer();
     } catch (CustomNullPointerException e) {
         System.out.println(e.getMessage());
     }
 }
 public static void NullPointer() throws CustomNullPointerException {
     String s = null;
     if (s == null) {
         throw new CustomNullPointerException("The string reference is null!");
     }
 }
}
