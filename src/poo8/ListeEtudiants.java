package poo8;

import java.util.ArrayList;
import java.util.Scanner;

public class ListeEtudiants {

    private static ArrayList<Etudiant> etudiants;

    public ListeEtudiants() {
        etudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public void rechercherEtudiantParNom(String nom) {

        for (Etudiant etudiant : etudiants) {

            if (nom.equals(etudiant.getNom())) {

                etudiant.afficherDetails();
                return;
            }

        }
        System.out.println("Aucun étudiant avec le nom " + nom + " n'a été trouvé.");
    }

    public void rechercherEtudiantParSpecialite(String specialite) {

        for (Etudiant etudiant : etudiants) {

            if (specialite.equals(etudiant.getSpecialite())) {

                etudiant.afficherDetails();
                return;
            }

        }
        System.out.println("Aucun étudiant avec la spécialité " + specialite + " n'a été trouvé.");
    }

    public void afficherEtudiants() {
        for (Etudiant etudiant : etudiants) {
            etudiant.afficherDetails();
        }
    }

    public static void modifierDetailsEtudiant(Etudiant etudiant) {

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

    public static void supprimerEtudiant(Etudiant etudiant) {

        if (etudiants.contains(etudiant)) {
            etudiants.remove(etudiant);
        } else {
            System.out.println("L'étudiant n'existe pas.");
        }

    }

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
