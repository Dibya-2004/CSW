package Assignment_5;

public class Q2 {

	    public static void main(String[] args) {
	        String str = "Hello";
	        System.out.println("Original: " + str);

	        String str2=" World";
	        System.out.println("Then : " + str2); 

	        str = str.concat(" World");
	        System.out.println("After Correction: " + str); 

	        CharSequence charSeq = "Java Programming"; 
	        System.out.println("CharSequence: " + charSeq);

	        System.out.println("Character at index 5: " + charSeq.charAt(5));
	        System.out.println("Subsequence (0-4): " + charSeq.subSequence(0, 4));
	        System.out.println("Length: " + charSeq.length());
	    }
	}
