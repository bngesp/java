
class BookAlreadyBorrowedException extends Exception {
    public BookAlreadyBorrowedException() {
        super("Le livre est déjà emprunté");
    }
}