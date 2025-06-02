package Assignment_5;

public class Q1 {
		    public static void main(String[] args) {
		        String l1 = "Hello";
		        String l2 = "Hello";
		        String o1 = new String("Hello");
		        String o2 = new String("Hello");
		        System.out.println("literal1 == literal2: " + (l1 == l2));
		        System.out.println("object1 == object2: " + (o1 == o2)); 
		        System.out.println("literal1 == object1: " + (l1 == o1));
		        System.out.println("literal1.equals(literal2): " + l1.equals(l2)); 
		        System.out.println("object1.equals(object2): " + o1.equals(o2));
		        System.out.println("literal1.equals(object1): " + l1.equals(o1));
		    }
		}
 