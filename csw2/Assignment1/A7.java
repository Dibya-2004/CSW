package Assignment1;
abstract class LibraryResource{
	private String title;
	private String author;
	public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	abstract void displayDetails();
}
class Book extends LibraryResource {
    private int pageCount;
    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + pageCount);
        System.out.println("*************************************");
    }
}
class Magazine extends LibraryResource {
    private String issueDate;
    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }
    public String getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    public void displayDetails() {
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Date: " + issueDate);
        System.out.println("*************************************");
    }
}
class DVD extends LibraryResource {
    private int duration;
    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("*************************************");
    }
}
public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("NCERT", "GOVT", 360);
        Magazine magazine = new Magazine("VIRAT THE KING", "ANONYMOUS", "March 2024");
        DVD dvd = new DVD("Inception", "Christopher Nolan", 148);

        book.displayDetails();
        magazine.displayDetails();
        dvd.displayDetails();
	}

}
