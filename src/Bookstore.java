import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    List<Bookstore> books = new ArrayList<>();



    public void addBook(String title, String author, int price){
        books.add((Bookstore) books);
    }
    public void findBook(String titleBook) throws BookNotFoundException{
        for (Bookstore book : books){

        }

    public void displayBooks(){

    }

}}
