import org.w3c.dom.ls.LSOutput;

public class BookstoreApplication {

    public static void main(String[] args) {

        Bookstore bookstore = new Bookstore();
        bookstore.addBook(new Book("A gyűrű szövetsége", "Tolkien", 5000));
        bookstore.addBook(new Book("A két torony", "Tolkien", 5000));
        bookstore.addBook(new Book("A király visszatér", "Tolkien", 5000));


        try {
            Book book = bookstore.findBook("A két torony");
            System.out.println(book);

            book = bookstore.findBook("A kisherceg");
            System.out.println(book);
        } catch (BookNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }


        bookstore.displayBooks();
    }
}