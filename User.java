public abstract class User implements LibraryUser{
    private String nom;
    private String prenom;
    private String ine;

    // constructeur
    public User(String nom, String prenom, String ine) {
        this.nom = nom;
        this.prenom = prenom;
        this.ine = ine;
    }

    // methode emprunter un livre
    @Override
    public void borrowBook(Book book) {
        
    }

    // methode retourner un livre
    @Override
    public void returnBook(Book book) {

    }

    // getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getIne() {
        return ine;
    }

    // setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setIne(String ine) {
        this.ine = ine;
    }
}
