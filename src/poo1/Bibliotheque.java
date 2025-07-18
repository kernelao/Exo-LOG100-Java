package poo1;

import java.util.ArrayList;

public class Bibliotheque {
    ArrayList<Livre> livres;

    public Bibliotheque() {
        livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {

        String titreAValider = livre.getTitre();

        for (Livre livre1 : livres) {
            String nomLivre = livre1.getTitre();

            if (titreAValider.equals(nomLivre)) {
                System.out.println("Ce livre (" + livre1.getTitre() + ") existe déjà dans la liste de cette bibliothèque !");
                return;
            }

        }
        livres.add(livre);
    }

    public void afficherLivresDisponibles() {

        for (Livre livre : livres) {
            if (livre.isDisponible()) {
                System.out.println("Le livre " + livre.getTitre() + " (" + livre.getAnneePublication() + ") de " + livre.getAuteur() + " est disponible en bibliothèque !");
            }
        }

    }
}
