package poo8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Gère une liste d'étudiants et les opérations courantes (ajout, recherche, suppression, etc.).
 *
 * @author kernelao
 * @version 1.0
 */
public class ListeEtudiants {

    private static ArrayList<Etudiant> etudiants;

    /**
     * Constructeur qui initialise la liste des étudiants.
     */
    public ListeEtudiants() {
        etudiants = new ArrayList<>();
    }

    /**
     * Ajoute un étudiant à la liste.
     *
     * @param etudiant L'étudiant à ajouter
     */
    public void ajouterEtudiant(Etudiant etudiant) {

        if (etudiant == null) {
            System.out.println("L'etudiant n'existe pas (null).");
            return;
        }
        etudiants.add(etudiant);
    }

    /**
     * Recherche un étudiant par son nom.
     *
     * @param nom Le nom de l'étudiant
     */
    public void rechercherEtudiantParNom(String nom) {

        if (etudiants.isEmpty()) {
            System.out.println("La liste d'étudiants est vide.");
            return;
        }

        for (Etudiant etudiant : etudiants) {

            if (nom.equals(etudiant.getNom())) {
                etudiant.afficherDetails();
                return;
            }
        }
        System.out.println("Aucun étudiant avec le nom " + nom + " n'a été trouvé.");
    }

    /**
     * Recherche un étudiant par sa spécialité.
     *
     * @param specialite La spécialité de l'étudiant
     */
    public void rechercherEtudiantParSpecialite(String specialite) {

        if (etudiants.isEmpty()) {
            System.out.println("La liste d'étudiants est vide.");
            return;
        }

        for (Etudiant etudiant : etudiants) {

            if (specialite.equals(etudiant.getSpecialite())) {

                etudiant.afficherDetails();
                return;
            }
        }
        System.out.println("Aucun étudiant avec la spécialité " + specialite + " n'a été trouvé.");
    }

    /**
     * Affiche tous les étudiants de la liste.
     */
    public void afficherEtudiants() {

        if (etudiants.isEmpty()) {
            System.out.println("La liste d'étudiants est vide.");
            return;
        }

        for (Etudiant etudiant : etudiants) {
            etudiant.afficherDetails();
        }
    }

    /**
     * Permet de modifier les informations d’un étudiant existant.
     *
     * @param etudiant L'étudiant à modifier
     */
    public static void modifierDetailsEtudiant(Etudiant etudiant) {

        if (etudiant == null) {
            System.out.println("L'etudiant n'existe pas (null).");
            return;
        }

        if (etudiants.isEmpty()) {
            System.out.println("La liste d'etudiants est vide.");
            return;
        }

        Scanner clavier = new Scanner(System.in);
        String optionQuitter = "q";
        String choix;

        if (etudiants.contains(etudiant)) {

            do {
                System.out.println("Voulez-vous modifier le nom (n), le prénom (p), l'âge (a) ou la spécialité (s). Vous pouvez aussi quitter (q).");
                choix = clavier.nextLine();

                switch (choix) {
                    case "n":
                        System.out.print("Entrez le nouveau nom de l'étudiant -->  ");
                        etudiant.setNom(clavier.nextLine());
                        break;
                    case "p":
                        System.out.print("Entrez le nouveau prénom de l'étudiant -->  ");
                        etudiant.setPrenom(clavier.nextLine());
                        break;
                    case "a":
                        System.out.print("Entrez le nouvel age de l'étudiant -->  ");
                        etudiant.setAge(clavier.nextInt());
                        clavier.nextLine();
                        break;
                    case "s":
                        System.out.print("Entrez la nouvelle spécialité de l'étudiant -->  ");
                        etudiant.setSpecialite(clavier.nextLine());
                        break;
                }

            } while (!choix.equals(optionQuitter));


        } else {
            System.out.println("L'étudiant n'existe pas.");
        }

    }

    /**
     * Supprime un étudiant de la liste.
     *
     * @param etudiant L'étudiant à supprimer
     */
    public static void supprimerEtudiant(Etudiant etudiant) {

        if (etudiant == null) {
            System.out.println("L'etudiant n'existe pas (null).");
            return;
        }

        if (etudiants.isEmpty()) {
            System.out.println("La liste d'etudiants est vide.");
            return;
        }

        if (etudiants.contains(etudiant)) {
            etudiants.remove(etudiant);
        } else {
            System.out.println("L'étudiant n'existe pas.");
        }
    }

    /**
     * Permet de récupérer un étudiant selon son nom ou sa spécialité.
     *
     * @return L'objet étudiant correspondant, ou null s'il n'est pas trouvé
     */
    public static Etudiant recupererEtudiant() {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Voulez-vous faire une recherche par nom d'étudiant (n) ou par spécialité (v) ? : ");
        String choix = clavier.nextLine();

        switch (choix) {
            case "n":
                System.out.println("Entrez le nom de l'étudiant à supprimer --> ");
                String nom = clavier.nextLine();
                for (Etudiant etudiant : etudiants) {
                    if (nom.equals(etudiant.getNom())) {
                        return etudiant;
                    }
                }
                break;
            case "v":
                System.out.println("Entrez la spécialité de l'étudiant à supprimer --> ");
                String specialite = clavier.nextLine();
                for (Etudiant etudiant : etudiants) {
                    if (specialite.equals(etudiant.getSpecialite())) {
                        return etudiant;
                    }
                }
                break;
        }
        return null;
    }
}
