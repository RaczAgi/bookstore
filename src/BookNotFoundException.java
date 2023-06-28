public class BookNotFoundException extends Exception{
    public BookNotFoundException(String uzenet){
        super(uzenet);
    }
    BookNotFoundException(){
        super("Nincs ilyen könyv");
    }

}
