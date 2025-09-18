package poo2;

import java.util.ArrayList;

/**
 * Représente une équipe composée de joueurs.
 * Permet d'ajouter des joueurs, d'afficher la moyenne de performance,
 * de trouver le meilleur joueur et d'afficher les joueurs par poste.
 *
 * @author kernelao
 * @version 1.0
 */
public class Equipe {
    private String nom;
    private ArrayList<Joueur> joueurs;

    /**
     * Crée une nouvelle équipe avec un nom et instancie la liste
     *
     * @param nom le nom de l'équipe
     */
    public Equipe(String nom) {
        this.nom = nom;
        this.joueurs = new ArrayList<>();
    }

    /**
     * Ajoute un joueur à l'équipe si son numéro est unique.
     *
     * @param j le joueur à ajouter
     */
    public void ajouterJoueur(Joueur j) {

        if (j == null) {
            System.out.println("Erreur : le joueur est null.");
            return;
        }

        for (Joueur joueur : joueurs) {
            if (j.getNumero() == joueur.getNumero() ) {
                System.out.println("Le numéro " + joueur.getNumero() + " est déjà pris.");
                return;
            }
        }
        joueurs.add(j);
    }

    /**
     * Calcule et retourne la moyenne des notes de performance de l'équipe.
     *
     * @return la moyenne des performances, ou 0 si l'équipe est vide
     */
    public int afficherMoyennePerformance() {

        if (joueurs.isEmpty()) {
            System.out.println("Erreur : la liste des joueurs est vide.");
            return 0;
        }

        int moyennePerformanceEquipe = 0;
        for (Joueur joueur : joueurs) {
            moyennePerformanceEquipe += joueur.getNotePerformance();
        }
        return (moyennePerformanceEquipe / joueurs.size());
    }

    /**
     * Trouve et retourne le joueur ayant la meilleure performance.
     *
     * @return le meilleur joueur, ou null si la liste est vide
     */
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

    /**
     * Affiche tous les joueurs occupant un poste donné.
     *
     * @param poste le poste à rechercher
     */
    public void afficherPoste(Poste poste) {

        if (poste == null) {
            System.out.println("Le poste spécifié est null.");
            return;
        }

        boolean joueurTrouve = false;
        for (Joueur joueur : joueurs) {
            if (joueur.getPoste() == poste) {
                System.out.println("Le joueur " + joueur.getNom() + " (numéro " + joueur.getNumero() + ") joue dans le poste " + joueur.getPoste());
                joueurTrouve = true;
            }
        }
        if (!joueurTrouve) {
            System.out.println("Aucun joueur trouvé dans le poste : " + poste);
        }

    }
}
