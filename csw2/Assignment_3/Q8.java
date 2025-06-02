package Assignment_3;
class CustomCheckedException extends Exception {
	public CustomCheckedException(String message) {
		super(message);
	}
}
public class Q8 {
	public static void checkCondition(int value) throws CustomCheckedException {
		if (value < 0) {
			throw new CustomCheckedException("Value cannot be negative!");
		}
	}
	public static void main(String[] args) {
		try {
			int value = -5; 
			checkCondition(value);
			System.out.println("The value is valid: " + value);
		} catch (CustomCheckedException e) {
			System.out.println("Caught CustomCheckedException: " + e.getMessage());
		}
	}
}
