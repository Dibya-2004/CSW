package Assignment_2;

class Book {
	int bookId, price;
	String bookName;

	public Book(int bookId, int price, String bookName) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", price=" + price + ", bookName=" + bookName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book b = (Book) obj;
			return this.price == price;
		}
		return false;

	}
}

public class Q2 {
	public static void main(String[] args) {
		Book bk1 = new Book(001, 10, "abc");
		Book bk2 = new Book(002, 150, "qwe");

		System.out.println(bk1);
		System.out.println(bk2);
		System.out.println("are book equal in price " + bk1.equals(bk2));
	}
}
