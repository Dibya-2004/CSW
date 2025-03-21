package oops;

class Library {
	private Book[] books;
	private int count;

	public Library(int size) {
		books = new Book[size];
		count = 0;
	}

	public void addBook(Book book) {
		if (count < books.length) {
			books[count++] = book;
			System.out.println("Book added: " + book.getTitle());
		} else {
			System.out.println("Library is full, cannot add more books.");
		}
	}

	public void displayBooks() {
		System.out.println("\nLibrary Collection:");
		for (int i = 0; i < count; i++) {
			books[i].displayInfo();
		}
	}
}

class Book {
	private String title;
	private String author;
	private String isbn;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void displayInfo() {
		System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
	}
}

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library(5);

		Book book1 = new Book("NCERT bio", "ME", "720");
		Book book2 = new Book("NCERT MATH", "ME", "0");
		Book book3 = new Book("NCERT ENG", "ME", "59");
		Book book4 = new Book("NCERT PHYSICS", "YOU", "70");
		Book book5 = new Book("NCERT chem", "you", "100");

		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		library.displayBooks();
	}

}
