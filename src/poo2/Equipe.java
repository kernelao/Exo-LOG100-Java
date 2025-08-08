package poo2;

import java.util.ArrayList;

public class Equipe {
    private String nom;
    private ArrayList<Joueur> joueurs;

    public Equipe(String nom) {
        this.nom = nom;
        this.joueurs = new ArrayList<>();
    }

    public void ajouterJoueur(Joueur j) {
        for (Joueur joueur : joueurs) {
            if (j.getNumero() == joueur.getNumero() ) {
                System.out.println("Le numéro " + joueur.getNumero() + " est déjà pris.");
                return;
            }
        }
        joueurs.add(j);
    }

    public int afficherMoyennePerformance() {

        int moyennePerformanceEquipe = 0;
        for (Joueur joueur : joueurs) {
            moyennePerformanceEquipe += joueur.getNotePerformance();
        }
        return (moyennePerformanceEquipe / joueurs.size());
    }

    public Joueur trouverMeilleurJoueur() {

        if (joueurs.isEmpty()) {
            return null;
        }

        Joueur meilleurJoueur = joueurs.get(0);

        for (int i = 1; i < joueurs.size(); i++) {

            if (joueurs.get(i).getNotePerformance() > meilleurJoueur.getNotePerformance()) {
                meilleurJoueur = joueurs.get(i);
            }

        }

        return meilleurJoueur;
    }

    public void afficherPoste(Poste poste) {

        for (Joueur joueur : joueurs) {

            if (joueur.getPoste() == poste) {
                System.out.println("Le joueur " + joueur.getNom() + " (numéro " + joueur.getNumero() + ") joue dans le poste " + joueur.getPoste());
            }

        }


    }

}
