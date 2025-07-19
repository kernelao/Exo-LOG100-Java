package poo7;

/**
 * Représente un livre avec un titre, un auteur et une année de publication.
 * Cette classe contient des méthodes pour accéder aux informations du livre
 * et pour les afficher.
 *
 * @author kernelao
 * @version 1.0
 */
public class Livre {

    private String titre;
    private String auteur;
    private int anneePublication;

    /**
     * Constructeur du livre.
     *
     * @param titre le titre du livre
     * @param auteur l'auteur du livre
     * @param anneePublication l'année de publication du livre
     */
    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    // Getters - accesseurs
    public String getTitre() {
        return this.titre;
    }
    public String getAuteur() {
        return this.auteur;
    }

    /**
     * Affiche les informations du livre : titre, auteur et année de publication.
     */
    public void afficherInfo() {
        System.out.println("Titre: " + this.titre + "\nAuteur: " + this.auteur + "\nAnnée de publication: " + this.anneePublication);
    }



}
