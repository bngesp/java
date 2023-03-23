import java.time.Instant;
import java.util.*;

public class Student extends User{
    private List<Book> borrowedBooks;

    public Student(String nom, String prenom, String ine) {
        super(nom, prenom, ine);
        this.borrowedBooks = new ArrayList<>();
    }

    // emprunter un livre
    @Override
    public void borrowBook(Book book) {
        super.borrowBook(book);
        this.borrowedBooks.add(book);
        book.setDateEmprunt(Instant.now());
    }

    // retourner livre
    @Override
    public void returnBook(Book book) {
        super.returnBook(book);
        this.borrowedBooks.remove(book);
        book.setDateEmprunt(null);
    }

    // afficher les livres empruntés
    public void displayBorrowedBooks(){
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }

    // getters
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

}
