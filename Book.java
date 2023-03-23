import java.time.Instant;
import java.util.Date;

public class Book {
    private String titre;
    private  String  auteur;
    private  Date datePub;
    private  String ISBN;
    private  int nbrPage;
    private  int nbrExemplaire;
    private BookStatus status;
    private Instant dateEmprunt;

    // constructeur
    public Book(String titre, String auteur, Date datePub, String ISBN, int nbrPage, int nbrExemplaire) {
        this.titre = titre;
        this.auteur = auteur;
        this.datePub = datePub;
        this.ISBN = ISBN;
        this.nbrPage = nbrPage;
        this.nbrExemplaire = nbrExemplaire;
        this.status = BookStatus.AVAILABLE; // par défaut
    }

    // emprunter un livre
    public void  borrowBook(Student student) throws BookAlreadyBorrowedException{
        if (this.status == BookStatus.AVAILABLE){
            this.status = BookStatus.BORROWED;
            student.borrowBook(this);
            Library.borrowBooks.put(this, student);
        }
        else
            throw BookAlreadyBorrowedException();
    }

    // retourner un livre
    public void returnBook(Student student) throws BookNotBorrowedException{
        if (this.status == BookStatus.BORROWED){
            this.status = BookStatus.AVAILABLE;
            student.returnBook(this);
            Library.borrowBooks.remove(this, student);
        }
        else
            throw BookNotBorrowedException();
    }

    // to string
    @Override
    public String toString() {
        return "Book{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", datePub=" + datePub +
                ", ISBN='" + ISBN + '\'' +
                ", nbrPage=" + nbrPage +
                ", nbrExemplaire=" + nbrExemplaire +
                '}';
    }

    // getters
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public Date getDatePub() {
        return datePub;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNbrPage() {
        return nbrPage;
    }

    public int getNbrExemplaire() {
        return nbrExemplaire;
    }

    // setters
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setDatePub(Date datePub) {
        this.datePub = datePub;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNbrPage(int nbrPage) {
        this.nbrPage = nbrPage;
    }

    public void setNbrExemplaire(int nbrExemplaire) {
        this.nbrExemplaire = nbrExemplaire;
    }

    // get status
    public BookStatus getStatus() {
        return status;
    }
    // set status
    public void setStatus(BookStatus status) {
        this.status = status;
    }

    // get date emprunt
    public Instant getDateEmprunt() {
        return dateEmprunt;
    }

    // set date emprunt
    public void setDateEmprunt(Instant dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

}
