import java.util.ArrayList;

class Book {
    private String title, author, isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (ISBN: " + isbn + ")";
    }
}

class BookCollection {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    public void removeBook(String isbn) {
        boolean removed = books.removeIf(book -> book.getIsbn().equals(isbn));
        if (removed) {
            System.out.println("Book with ISBN " + isbn + " removed.");
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The collection is empty.");
            return;
        }
        System.out.println("\nBooks in collection:");
        books.forEach(System.out::println);
    }
}

public class ObjectOrientedPrinciple2 {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        collection.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        collection.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
        collection.addBook(new Book("1984", "George Orwell", "9780451524935"));

        collection.displayBooks();
        collection.removeBook("9780061120084");
        collection.displayBooks();
    }
}
