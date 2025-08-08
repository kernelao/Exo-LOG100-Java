package serie_2_1;

import java.util.ArrayList;
import java.util.Collections;

public class Bibliotheque {
    private ArrayList<Livre> livres;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        this.livres.add(livre);
    }

    public void trierParAnneePublication() {
        this.livres.sort(new AnneePublicationComparator());
    }

    public void afficherLivres() {
        for (Livre livre : this.livres) {
            System.out.println(livre);
        }
    }

    public void rechercherLivreParTitre(String titre) {
        for (Livre livre : this.livres) {
            if (livre.getTitre().equals(titre)) {
                System.out.println(livre);
                return;
            }
        }
        System.out.println("Le livre n'existe pas");
    }

    public void supprimerLivreParTitre(String titre) {
        for (Livre livre : this.livres) {
            if (livre.getTitre().equals(titre)) {
                this.livres.remove(livre);
                return;
            }
        }
        System.out.println("Le livre n'existe pas");
    }

}
