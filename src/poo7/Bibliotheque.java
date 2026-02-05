package poo7;

import java.util.ArrayList;

/**
 * Représente une bibliothèque contenant une liste de livres.
 * Permet d’ajouter, rechercher et afficher des livres.
 *
 * @author kernelao
 * @version 1.0
 */
public class Bibliotheque {

    private ArrayList<Livre> listeLivres;

    /**
     * Constructeur de la bibliothèque.
     * Initialise la liste des livres.
     */
    public Bibliotheque() {
        listeLivres = new ArrayList<>();
    }

    /**
     * Ajoute un livre à la bibliothèque.
     *
     * @param livre le livre à ajouter
     */
    public void ajouterLivre(Livre livre) {

        if (livre == null) {
            System.out.println("Le livre n'existe pas (null).");
            return;
        }
        this.listeLivres.add(livre);
    }

    /**
     * Recherche un livre par son titre et affiche ses informations s’il est trouvé.
     *
     * @param titre le titre du livre à rechercher
     */
    public void rechercherLivreParTitre(String titre) {

        if (listeLivres.isEmpty()) {
            System.out.println("La liste de livres est vide.");
            return;
        }

        for (Livre livre : listeLivres) {

            if (titre.equals(livre.getTitre())) {
                livre.afficherInfo();
                return;
            }
        }
        System.out.println("Aucun livre avec ce titre (" + titre + ") n'a été trouvé dans la bibliothèque.");
    }

    /**
     * Recherche un livre par son auteur et affiche ses informations s’il est trouvé.
     *
     * @param auteur le nom de l’auteur à rechercher
     */
    public void rechercherLivreParAuteur(String auteur) {

        if (listeLivres.isEmpty()) {
            System.out.println("La liste de livres est vide.");
            return;
        }

        for (Livre livre : listeLivres) {

            if (auteur.equals(livre.getAuteur())) {
                livre.afficherInfo();
                return;
            }

        }
        System.out.println("Aucun livre avec cet auteur (" + auteur + ") n'a été trouvé dans la bibliothèque.");
    }

    /**
     * Affiche les informations de tous les livres dans la bibliothèque.
     */
    public void afficherTousLivres() {

        if (listeLivres.isEmpty()) {
            System.out.println("La liste de livres est vide.");
            return;
        }

        for (Livre livre : listeLivres) {
            livre.afficherInfo();
            System.out.println();
        }
    }


}
