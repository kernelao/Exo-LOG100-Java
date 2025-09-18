package poo1;

import java.util.ArrayList;


/**
 * Représente une bibliothèque contenant des livres.
 * Permet d'ajouter des livres et d'afficher les livres disponibles.
 *
 * @author kernelao
 * @version 1.0
 */
public class Bibliotheque {

    /**
     * La liste des livres contenus dans la bibliothèque.
     */
    private ArrayList<Livre> listeLivres;

    /**
     * Constructeur de la classe Bibliotheque.
     * Initialise une nouvelle liste vide de livres.
     */
    public Bibliotheque() {
        listeLivres = new ArrayList<>();
    }

    /**
     * Ajoute un livre à la bibliothèque s'il n'existe pas déjà.
     *
     * @param livre le livre à ajouter
     */
    public void ajouterLivre(Livre livre) {

        String titreAValider = livre.getTitre();

        for (Livre livre1 : listeLivres) {
            String nomLivre = livre1.getTitre();

            if (titreAValider.equals(nomLivre)) {
                System.out.println("Ce livre (" + livre1.getTitre() + ") existe déjà dans la liste de cette bibliothèque !");
                return;
            }
        }
        listeLivres.add(livre);
    }

    /**
     * Affiche tous les livres disponibles dans la bibliothèque.
     * Un livre est considéré disponible si sa méthode getDisponible() renvoie true.
     *
     */
    public void afficherLivresDisponibles() {

        if (listeLivres == null || listeLivres.isEmpty()) {
            System.out.println("La liste des livres est vide !");
            return;
        }

        for (Livre livre : listeLivres) {
            if (livre.getDisponible()) {
                System.out.println("Le livre " + livre.getTitre() + " (" + livre.getAnneePublication() + ") de " + livre.getAuteur() + " est disponible en bibliothèque !");
            }
        }

    }
}
