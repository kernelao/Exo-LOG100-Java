package poo4;

/**
 * Classe de base représentant un document dans la bibliothèque.
 * Contient les informations communes à tous les types de documents.
 *
 * @author kernelao
 * @version 1.0
 */
public class Document {

    private String titre;
    private String auteur;
    private int anneePublication;

    /**
     * Constructeur de la classe Document.
     *
     * @param titre             le titre du document
     * @param auteur            l’auteur du document
     * @param anneePublication  l’année de publication du document
     */
    public Document(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    /**
     * Affiche les détails communs du document :
     * titre, auteur et année de publication.
     */
    public void afficherDetail() {
        System.out.println("Titre : " + this.titre +
                           "\nAuteur : " + this.auteur +
                           "\nAnnée de publication : " + this.anneePublication);
    }

}
