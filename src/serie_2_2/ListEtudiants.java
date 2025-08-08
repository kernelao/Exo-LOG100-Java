package serie_2_2;

import java.util.*;

public class ListEtudiants {
    private Set<Eleve> etudiants;
    private List<Eleve> liste;

    public ListEtudiants() {
        this.etudiants = new HashSet<>();
    }

    public void ajouterEtudiant(Eleve etudiant) {
        this.etudiants.add(etudiant);
    }

    public void afficherEtudiants() {
        String message = "[";
        int lastIndex = etudiants.size();
        int compteur = 1;
        for (Eleve etudiant : this.etudiants) {
            if (compteur == lastIndex) {
                message += etudiant + "]";
                System.out.println(message);
                return;
            }
            message += etudiant + ",\n";
            compteur++;
        }
    }


    public void trierEtudiants() {
        this.liste = new ArrayList<>(this.etudiants);
        Collections.sort(liste);
    }

    public void afficherListe() {
        String message = "[";
        int lastIndex = liste.size();
        for (Eleve etudiant : this.liste) {
            if (etudiant == this.liste.get(lastIndex - 1)) {
                message += etudiant + "]";
                System.out.println(message);
                return;
            }
            message += etudiant + ",\n";
        }
    }

}
