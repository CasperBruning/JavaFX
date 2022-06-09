public class Boek
{
    private String titel;
    private String isbn;
    private Persoon auteur;

    public Boek(String titel, String isbn, Persoon auteur)
    {
        this.titel = titel;
        this.isbn = isbn;
        this.auteur = auteur;
    }

    public String toString()
    {
        return "Titel: " + "\t" + titel + "\n" +
                "Auteur: " + auteur.toString() + "\n" +
                "ISBN: " + "\t" + isbn;
    }
}
