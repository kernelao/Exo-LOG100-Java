import poo1.*;
import poo2.*;
import poo3.*;
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
        //exo1smn2();

        // Exercice 2 - Gestion d'une équipe de sport
        //exo2smn2();

        // Exercice 3 - Simulateur de véhicules
        exo3smn2();
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

    public static void exo2smn2() {

        Joueur joueur1 = new Joueur("Messi", Poste.MILIEU, 10, 4);
        Joueur joueur2 = new Joueur("Ronaldo", Poste.ATTAQUE, 7, 5);
        Joueur joueur3 = new Joueur("Mbappé", Poste.ATTAQUE, 7,7);
        Joueur joueur4 = new Joueur("De Bruyne", Poste.MILIEU, 17,2);
        Joueur joueur5 = new Joueur("Haaland", Poste.ATTAQUE, 9,5);
        Joueur joueur6 = new Joueur("Van Dijk", Poste.DEFENSE, 4,7);

        Equipe equipe1 = new Equipe("DreamTeam");


        equipe1.ajouterJoueur(joueur1);
        equipe1.ajouterJoueur(joueur2);
        equipe1.ajouterJoueur(joueur3);
        equipe1.ajouterJoueur(joueur4);
        equipe1.ajouterJoueur(joueur5);
        equipe1.ajouterJoueur(joueur6);


        System.out.println(equipe1.afficherMoyennePerformance());

        System.out.println(equipe1.trouverMeilleurJoueur().getNom());

        equipe1.afficherPoste(Poste.ATTAQUE);
        equipe1.afficherPoste(Poste.DEFENSE);

    }

    public static void exo3smn2() {


        Moteur moteur1 = new Moteur("Essence", 100);
        Moteur moteur2 = new Moteur("Diesel", 80);

        Vehicule voiture1 = new Vehicule("Ford", "Taurus", moteur1);
        Vehicule voiture2 = new Vehicule("Nissan", "Altima", moteur2);
        Vehicule voiture3 = new Vehicule("Toyota", "Corrola", moteur1);
        Vehicule voiture4 = new Vehicule("Hyundai", "Elantra", moteur2);

        System.out.println("État 1 :");
        Vehicule.afficherEtat(voiture1);
        Vehicule.afficherEtat(voiture2);
        Vehicule.afficherEtat(voiture3);
        Vehicule.afficherEtat(voiture4);

        System.out.println("État 2 :");
        voiture1.accelerer();
        voiture2.accelerer();
        voiture3.accelerer();
        voiture4.accelerer();
        Vehicule.afficherEtat(voiture1);
        Vehicule.afficherEtat(voiture2);
        Vehicule.afficherEtat(voiture3);
        Vehicule.afficherEtat(voiture4);

        System.out.println("État 3 :");
        voiture1.freiner();
        voiture2.freiner();
        voiture3.freiner();
        voiture4.freiner();
        Vehicule.afficherEtat(voiture1);
        Vehicule.afficherEtat(voiture2);
        Vehicule.afficherEtat(voiture3);
        Vehicule.afficherEtat(voiture4);

        System.out.println("Plus rapide entre la Ford et la Nissan ?");
        Vehicule.afficherEtat(voiture1.comparer(voiture2));

        System.out.println("Plus rapide entre la Toyota et la Hyundai ?");
        Vehicule.afficherEtat(voiture3.comparer(voiture4));

    }

}