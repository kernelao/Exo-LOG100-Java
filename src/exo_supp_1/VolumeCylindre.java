package exo_supp_1;

import java.util.Scanner;

public class VolumeCylindre {

    public static void lancer() {
        double rayon = demanderValeurUtilisateur("Veuillez entrez le rayon du cylindre! -->  ");
        double hauteur = demanderValeurUtilisateur("Veuillez entrez la hauteur du cylindre! -->  ");
        double volume = calculerVolumeCylindre(rayon, hauteur);
        System.out.printf("Le volume du cylindre est %.2f u.", volume);
    }

    public static double demanderValeurUtilisateur(String message) {

        final double TEMPERATURE_MIN_THEORIQUE = 0;

        Scanner clavier = new Scanner(System.in);
        System.out.print(message);

        while (true) {
            if (!clavier.hasNextDouble()) {
                System.out.print("Veuillez entrer une valeur numérique! --->  ");
                clavier.next();
                continue;
            }
            double valeur = clavier.nextDouble();
            if (valeur < TEMPERATURE_MIN_THEORIQUE) {
                System.out.printf("Veuillez entrer une valeur valide! Elle doit être supérieure à %f", TEMPERATURE_MIN_THEORIQUE);
                clavier.next();
                continue;
            }
            return valeur;
        }
    }

    public static double calculerVolumeCylindre(double rayon, double hauteur) {
        return (Math.PI * Math.pow(rayon, 2) * hauteur);
    }




}
