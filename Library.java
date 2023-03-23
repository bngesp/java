import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Library {
    private List<Book> books;
    public static Map<Book, Student> borrowBooks = new  HashMap<>();
    private String name;
    private String adresse;

    public Library(String name, String adresse) {
        this.books = new ArrayList<>();
        this.name = name;
        this.adresse = adresse;
    }

    // get borrowed books student
    public List<Book> getBorrowedBooks(Student student){
        List<Book> l = new ArrayList<>();
        List<Book> listeEtudiant= student.getBorrowedBooks();
        for (Book book : listeEtudiant) {
            if(borrowBooks.containsKey(book)){
                l.add(book);
            }
        }
        return l;
    }

    // get Overdue Books

    public List<Book> getOverdueBooks(){
        List<Book> l = new ArrayList<>();
        for (Book book : books) {
            if(book.getStatus() == BookStatus.BORROWED && 
                book.getDateEmprunt().isAfter(Instant.now().plus(15, ChronoUnit.DAYS))){
                    l.add(book);
                }
        }
        //log.log("gezrg");
        return l;
    }
    


    // add book
    public void addBook(Book book){
        this.books.add(book);
    }
    // remove book
    public void removeBook(Book book){
        this.books.remove(book);
    }
    // search Book by ISBN
    public Book searchBook(String ISBN){
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)){
                return book;
            }
        }
       // books.stream().filter(book -> book.getISBN().equals(ISBN)).findFirst();
        return null;
    }

    // afficher tous les livres
    public void displayAllBooks(){
        for (Book book : books) {
            System.out.println(book);
        }

        // books.stream().forEach(System.out::println);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}