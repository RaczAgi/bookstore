import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    List<Book> books;

    Bookstore() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBook(String title) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new BookNotFoundException("Ilyen könyv nincs: " + title);
    }

    public void displayBooks() {
        System.out.println("Elérhető könyvek:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
