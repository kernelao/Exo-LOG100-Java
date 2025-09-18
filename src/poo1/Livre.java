package poo1;

/**
 * Représente un livre avec un titre, un auteur, une année de publication et une disponibilité.
 * Cette classe est utilisée par la classe {@link Bibliotheque}.
 *
 * @author kernelao
 * @version 1.0
 */
public class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;
    private boolean disponible;

    /**
     * Construit un nouveau livre.
     *
     * @param titre le titre du livre
     * @param auteur le nom de l'auteur du livre
     * @param anneePublication l'année de publication du livre
     */
    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.disponible = true;
    }

    // Mutateurs / setters
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Accesseurs / getters
    public boolean getDisponible() {
        return this.disponible;
    }
    public String getTitre() {
        return this.titre;
    }
    public String getAuteur() {
        return this.auteur;
    }
    public int getAnneePublication() {
        return this.anneePublication;
    }

}
