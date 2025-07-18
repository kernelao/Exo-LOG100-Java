package poo7;

import java.util.ArrayList;

public class Bibliotheque {

    private ArrayList<Livre> livre;

    public Bibliotheque() {
        livre = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        this.livre.add(livre);
    }

    public void rechercherLivreParTitre(String titre) {

        for (Livre livre : livre) {

            if (titre.equals(livre.getTitre())) {
                livre.afficherInfo();
                return;
            }

        }
        System.out.println("Aucun livre avec ce titre (" + titre + ") n'a été trouvé dans la bibliothèque.");

    }

    public void rechercherLivreParAuteur(String auteur) {
        for (Livre livre : livre) {

            if (auteur.equals(livre.getAuteur())) {
                livre.afficherInfo();
                return;
            }

        }
        System.out.println("Aucun livre avec cet auteur (" + auteur + ") n'a été trouvé dans la bibliothèque.");
    }

    public void afficherTousLivres() {
        for (Livre livre : livre) {
            livre.afficherInfo();
            System.out.println();
        }
    }


}
