import poo1.Bibliotheque;
import poo1.Livre;
import tableaux.*;

public class Main {
    public static void main(String[] args) {

        // Exercice 1 -- Jeu de devinette
        //Exo1JeuDevinette.lancer();
        //Exo1JeuDevinetteDoWhile.lancer();

        // Exercice 2 -- Chiffrement César
        //Exo2ChiffrementCesar.lancer();

        // Exercice 3A - Tableau inversé
        //InverserTableau.lancer();

        // Exercice 3B - Stocker un nombre (que l'utilisateur fourni) de chiffres aléatoire dans un tableau
        //TableauValeursAleatoires.lancer();

        // Exercice 3C - Deux tableaux triés qu'on fusionne, le tableau resultant doit être trié
        //FusionTableauxTries.lancer();

        // Exercice 3D - Convertir un tableau 2D en forme d'affichage de matrice
        //ConvertirTableauMatrice.lancer();

        // Exercice 3E - Transposer une matrice, donc les lignes deviennent des colonnes et inversement
        //TranspositionTableau.lancer();

        // Exercice 3F - Deux tableau 2D (deux matrices) à sommer
        //SommationMatrices.lancer();

        // Exercice 3G - Sommation lignes/colonnes tableau 2D
        //SommationLignesColonnes.lancer();

        // EXERCICE - SEMAINE 2
        // Exercice 1 - Bibliothèque et livres
        exo1smn2();

    }

    public static void exo1smn2() {

        Livre livre1 = new Livre("Père riche, père pauvre", "Robert Kiyosaki", 1997);
        Livre livre2 = new Livre("La semaine de 4 heures", "Timothy Ferriss", 2007);
        Livre livre3 = new Livre("L'homme le plus riche de Babylone", "George S. Clason", 1926);
        Livre livre4 = new Livre("Réfléchissez et devenez riche", "Napoleon Hill", 1937);
        Livre livre5 = new Livre("L'autoroute du millionnaire", "MJ DeMarco", 2011);

        Bibliotheque biblio = new Bibliotheque();

        System.out.println("Disponibilité :");
        biblio.ajouterLivre(livre1);
        biblio.ajouterLivre(livre2);
        biblio.ajouterLivre(livre3);
        biblio.ajouterLivre(livre4);
        biblio.ajouterLivre(livre5);

        biblio.afficherLivresDisponibles();
        System.out.println();

        Livre livre6 = new Livre("L'autoroute du millionnaire", "Xyz", 2011);
        biblio.ajouterLivre(livre6);

        System.out.println();
        livre3.setDisponible(false);
        livre4.setDisponible(false);
        biblio.afficherLivresDisponibles();


    }


}