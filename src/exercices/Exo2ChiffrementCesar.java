package exercices;

import java.util.Scanner;

public class Exo2ChiffrementCesar {

    public static void lancer() {

        // Constantes contenant les valeurs ASCII reliées à la lettre A, a, Z, z
        final int VALEUR_ASCII_A = 65;
        final int VALEUR_ASCII_Z = 90;
        final int VALEUR_ASCII_a = 97;
        final int VALEUR_ASCII_z = 122;

        // Variables du programme
        Scanner clavier = new Scanner(System.in);
        String entreeAChiffrer;
        int nbCaracteres;
        int decalage;
        String resultatChiffre = "";

        // Demande à l'utilisateur d'entrer une phrase à chiffrer
        System.out.print("Veuillez entrer une phrase à chiffrer ==>  ");
        entreeAChiffrer = clavier.nextLine();

        // Calcul de la taille de la phrase, variable qu'on utilisera pour le nombre d'itération
        nbCaracteres = entreeAChiffrer.length();

        // Demande à l'utilisateur d'entrer un nombre entier entre 1 et 25 inclusivement (système de vérification)
        System.out.print("Veuillez entrer une nombre entier compris entre 1 et 25 inclusivement ==>  ");

        // La boucle se reproduit à chaque fois qu'une des conditions est vrai -> pas un nombre entier ET entre 1 et 25
        while (true) {

            if (!clavier.hasNextInt()) {

                System.out.print("Désolé, mais vous devez entrer une nombre entier valide ! ==>  ");
                clavier.nextLine();

                continue;
            }

            decalage = clavier.nextInt();

            if ( !(decalage >= 1) || !(decalage <= 25) ) {

                System.out.print("Désolé, mais vous devez entrer une nombre entre 1 et 20 ! ==>  ");
                clavier.nextLine();

                continue;
            }

            // Si on arrive ici, c'est qu'on est pas entrée dans une condition, tout est OK !
            break;
        }


        // Système de décalage table ASCII (à l'aide du modulo) - plus efficace
        // Le code a été grandement raccourcit !!
        /*
        Cette situation peut s'apparenter à un cycle à boucler (de 0 à 25 ; car 26 lettres)
        Utilisation de l'arithmétique modulaire (théorie algébrique des nombres) sous sa forme la plus simple : l’arithmétique de l’horloge
         */

        for (int i = 0; i < nbCaracteres; i++) {

            // Extraire le caractère et vérifier, puis on vérifie si c'est une lettre
            char caracExtrait = entreeAChiffrer.charAt(i);

            if (Character.isLetter(caracExtrait)) {

                int base;
                if (Character.isUpperCase(caracExtrait)) {
                    base = VALEUR_ASCII_A;
                } else {
                    base = VALEUR_ASCII_a;
                }

                // Si majuscule, on soustrait la valeur ASCII de 'A' pour ramener la valeur à une base qui part à partir de 0, puis, on rajoutera la base juste apres avoir fait le décalage
                int numAsciiLettreADecaler = (((int) caracExtrait - base + decalage) % 26) + base;
                resultatChiffre += (char) numAsciiLettreADecaler;

            } else {
                resultatChiffre += caracExtrait;
            }

        }



        /* --> méthode lourde et pas efficace

        // Système de décalage avec la table ASCII
        for (int i = 0; i < nbCaracteres; i++) {

            // On itère autant de fois qu'on a de lettre (grâce à la méthode length() sur String)
            char caractereExtrait = entreeAChiffrer.charAt(i);

            // Cette méthode vérifie si le charactère est une lettre (et non un nombre, caractère spécial) (utile dans notre situation)
            if (Character.isLetter(caractereExtrait)) {

                // Si c'est une lettre, on capture le numéro ASCII reliée
                int numeroAsciiChar = (int)caractereExtrait;

                // On s'assure de garder les minuscules, donc un système de décalage qui reste
                // dans sa borne et recommence à la borne suppérieur si atteint sa limite
                if (numeroAsciiChar >= VALEUR_ASCII_A && numeroAsciiChar <= VALEUR_ASCII_Z) {

                    // On analyse si le décalage sort de nos bornes
                    int verificationBorne = numeroAsciiChar + decalage;

                    // Si oui, on revient à la borne inférieur
                    if (verificationBorne > VALEUR_ASCII_Z) {
                        int decalageFin = VALEUR_ASCII_Z - numeroAsciiChar;
                        int decalageDebut = decalage - decalageFin;
                        numeroAsciiChar = VALEUR_ASCII_A - 1 + decalageDebut; // On s'assure d'enlever 1 décalage, car on l'effectue manuellement
                        caractereExtrait = (char)numeroAsciiChar; // On retransforme en caractère

                        // Si le décalage reste dans les bornes, on a pas besoin de loop sur les bornes
                    } else {
                        numeroAsciiChar += decalage;
                        caractereExtrait = (char)numeroAsciiChar;
                    }
                    
                    // On stock chaque caractère (a-z)
                    resultatChiffre += caractereExtrait;

                    // Le cas pour les majuscules ici, on reproduit la même logique
                    // *********** Je sais pas si on aurait pu éviter la répétition ***************
                } else if (numeroAsciiChar >= VALEUR_ASCII_a && numeroAsciiChar <= VALEUR_ASCII_z) {

                    int verificationBorne = numeroAsciiChar + decalage;

                    if (verificationBorne > VALEUR_ASCII_z) {
                        int decalageFin = VALEUR_ASCII_z - numeroAsciiChar;
                        int decalageDebut = decalage - decalageFin;
                        numeroAsciiChar = VALEUR_ASCII_a - 1 + decalageDebut;
                        caractereExtrait = (char)numeroAsciiChar;
                    } else {
                        numeroAsciiChar += decalage;
                        caractereExtrait = (char)numeroAsciiChar;
                    }
                    // On stock chaque caractère (A-Z)
                    resultatChiffre += caractereExtrait;
                }

            } else {
                // On stock tout autre caractère qui n'est pas une lettre (donc chiffres ou caractères spéciaux)
                resultatChiffre += caractereExtrait;
            }
        }
         */

        // On affiche la phrase après notre petit algorithme de chiffrement
        System.out.print(resultatChiffre);
    }
}
