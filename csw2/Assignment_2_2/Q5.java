package Assignment_2_2;
import java.util.HashMap;

class Book {
    String id, name, author;
    int quantity;
    
    public Book(String id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author + ", quantity=" + quantity + "]";
    }
}

public class Q5 {
    public static void main(String[] args) {
        HashMap<String, Book> p1 = new HashMap<>();
        
        Book b = new Book("12A", "NCERT Physics", "Uman", 10);
        Book b1 = new Book("21A", "NCERT Math", "Uman", 1);
        
        System.out.println(b);
        System.out.println(b1);
        
        p1.put(b.id, b);
        p1.put(b1.id, b1);
        
        boolean p = true;
        for (Book m : p1.values()) {
            if (b.name.equalsIgnoreCase("NCERT Math")) {
                p = false;
                break;
            }
        }
        System.out.println("\nIs 'Ncert' present? " + p);
        p = true;
        for (Book book : p1.values()) {
            if (book.name.equalsIgnoreCase("NCERT Physics")) {
                p = true;
                break;
            }
        }
        if (p1.containsKey("12A")) {
            System.out.println("Found");
            p1.remove("12A");
        } else {
            System.out.println("Not found");
        }
        
        
        System.out.println("HashMap after operations: " + p1);
    }
}
