package poo4;

/**
 * Classe représentant un livre, héritant de la classe Document.
 * Contient des informations supplémentaires propres aux livres.
 *
 * @author kernelao
 * @version 1.0
 */
public class Livre extends Document {

    private int nombrePages;
    private Genre genre;

    /**
     * Constructeur de la classe Livre.
     *
     * @param titre             le titre du livre
     * @param auteur            l’auteur du livre
     * @param anneePublication  l’année de publication
     * @param genre             le genre littéraire du livre
     * @param nombrePages       le nombre de pages du livre
     */
    public Livre(String titre, String auteur, int anneePublication, Genre genre, int nombrePages) {
        super(titre, auteur, anneePublication);
        this.nombrePages = nombrePages;
        this.genre = genre;
    }

    /**
     * Affiche les détails du livre : informations communes + pages et genre.
     */
    @Override
    public void afficherDetail() {
        super.afficherDetail();
        System.out.println("Nombre de pages : " + this.nombrePages +
                           "\nGenre : " + this.genre + "\n");
    }

}
