public class BookNotBorrowedException extends Exception{
    public BookNotBorrowedException() {
        super("Le livre n'est pas emprunté");
    }
}
