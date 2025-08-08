import exo_supp_1.ConvertisseurTemperature;
import exo_supp_1.VolumeCylindre;
import poo1.*;
import poo2.*;
import poo3.*;
import poo4.*;
import poo5.*;
import poo6.*;
import poo7.*;
import poo8.*;
import serie_1_4.Avion;
import serie_1_4.Voiture;
import serie_1_5.Attaquant;
import serie_1_5.Guerrier;
import serie_2_1.Bibliotheque;
import tableaux.*;
import serie_1_1.*;
import serie_1_2.*;
import serie_1_3.*;
import serie_1_4.*;
import serie_1_5.*;
import serie_1_6.*;
import serie_1_7.*;

import serie_2_1.*;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        //exo3smn2();

        // EXERCICE - SEMAINE 3
        // Exercice 1 - Gestion d'une bibliothèque
        //exo1smn3();
        // Exercice 2 - Gestionnaire de contacts
        //exo2smn3();
        // Exercice 3 - Gestionnaire de produits
        //exo3smn3();
        // Exercice 4 - Gestion de livres (programme interactif)
        //exo4smn3();
        // Exercice 5 - Système de gestion d'étudiants
        //exo5smn3();

        // Exo supp - semaine 03
        // Exo 1 :
        //ConvertisseurTemperature.lancer();

        // Exo 2 :
        //VolumeCylindre.lancer();

        // Semaine 4 - Exo 1
        //smn4exo1();
        // Semaine 4 - Exo 2
        //smn4exo2();
        // Semaine 4 - Exo 3
        //smn4exo3();
        // Semaine 4 - Exo 4
        //smn4exo4();
        // Semaine 4 - Exo 5
        //smn4exo5();
        // Semaine 4 - Exo 6
        //smn4exo6();
        // Semaine 4 - Exo 7
        //smn4exo7();

        // Semaine 4 - Exo 1
        smn4exo2_1();


    }

    public static void exo1smn2() {

        poo1.Livre livre1 = new poo1.Livre("Père riche, père pauvre", "Robert Kiyosaki", 1997);
        poo1.Livre livre2 = new poo1.Livre("La semaine de 4 heures", "Timothy Ferriss", 2007);
        poo1.Livre livre3 = new poo1.Livre("L'homme le plus riche de Babylone", "George S. Clason", 1926);
        poo1.Livre livre4 = new poo1.Livre("Réfléchissez et devenez riche", "Napoleon Hill", 1937);
        poo1.Livre livre5 = new poo1.Livre("L'autoroute du millionnaire", "MJ DeMarco", 2011);

        poo1.Bibliotheque biblio = new poo1.Bibliotheque();

        System.out.println("Disponibilité :");
        biblio.ajouterLivre(livre1);
        biblio.ajouterLivre(livre2);
        biblio.ajouterLivre(livre3);
        biblio.ajouterLivre(livre4);
        biblio.ajouterLivre(livre5);

        biblio.afficherLivresDisponibles();
        System.out.println();

        poo1.Livre livre6 = new poo1.Livre("L'autoroute du millionnaire", "Xyz", 2011);
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

        poo3.Vehicule voiture1 = new poo3.Vehicule("Ford", "Taurus", moteur1);
        poo3.Vehicule voiture2 = new poo3.Vehicule("Nissan", "Altima", moteur2);
        poo3.Vehicule voiture3 = new poo3.Vehicule("Toyota", "Corrola", moteur1);
        poo3.Vehicule voiture4 = new poo3.Vehicule("Hyundai", "Elantra", moteur2);

        System.out.println("État 1 :");
        poo3.Vehicule.afficherEtat(voiture1);
        poo3.Vehicule.afficherEtat(voiture2);
        poo3.Vehicule.afficherEtat(voiture3);
        poo3.Vehicule.afficherEtat(voiture4);

        System.out.println("État 2 :");
        voiture1.accelerer();
        voiture2.accelerer();
        voiture3.accelerer();
        voiture4.accelerer();
        poo3.Vehicule.afficherEtat(voiture1);
        poo3.Vehicule.afficherEtat(voiture2);
        poo3.Vehicule.afficherEtat(voiture3);
        poo3.Vehicule.afficherEtat(voiture4);

        System.out.println("État 3 :");
        voiture1.freiner();
        voiture2.freiner();
        voiture3.freiner();
        voiture4.freiner();
        poo3.Vehicule.afficherEtat(voiture1);
        poo3.Vehicule.afficherEtat(voiture2);
        poo3.Vehicule.afficherEtat(voiture3);
        poo3.Vehicule.afficherEtat(voiture4);

        System.out.println("Plus rapide entre la Ford et la Nissan ?");
        poo3.Vehicule.afficherEtat(voiture1.comparer(voiture2));

        System.out.println("Plus rapide entre la Toyota et la Hyundai ?");
        poo3.Vehicule.afficherEtat(voiture3.comparer(voiture4));

    }

    public static void exo1smn3() {
        Document livre1 = new poo4.Livre("Livre1", "Auteur1", 2000, Genre.BIOGRAPHIE, 289);
        poo4.Livre livre2 = new poo4.Livre("Livre2", "Auteur2", 2010, Genre.ESSAI, 344);
        Document magazine1 = new Magazine("Magazine 1", "Auteur3", 2011, 1, "L'été");
        Magazine magazine2 = new Magazine("Magazine 2", "Auteur4", 2008, 2, "L'hiver");

        livre1.afficherDetail();
        magazine1.afficherDetail();
        livre2.afficherDetail();
        magazine2.afficherDetail();
    }
    public static void exo2smn3() {

        GestionnaireContacts gestionnaireContacts = new GestionnaireContacts();
        Contact contact1 = new Personne("James", "james@mail.com", 20, "4381234567");
        Contact contact2 = new Personne("Bob", "bob@mail.com", 27, "4381246577");
        Contact contact3 = new Entreprise("Macdo", "macdo@mail.com", "Alimentation", "23 rue Macdo");
        Contact contact4 = new Entreprise("Tim Hortons", "tim@mail.com", "Alimentation", "46 rue Tim");

        gestionnaireContacts.ajouterContact(contact1);
        gestionnaireContacts.ajouterContact(contact2);
        gestionnaireContacts.ajouterContact(contact3);
        gestionnaireContacts.ajouterContact(contact4);

        gestionnaireContacts.afficherContacts();
        System.out.println();

        gestionnaireContacts.rechercherContact("Bob");
        System.out.println();
        gestionnaireContacts.rechercherContact("Macdo");
        System.out.println();

        gestionnaireContacts.supprimerContact("Tim Hortons");
        System.out.println();
        gestionnaireContacts.afficherContacts();




    }
    public static void exo3smn3() {

        Panier monPanier = new Panier();

        Produit produit1 = new ProduitNumerique("Formation", 299, "10 MB", "Fichier PDF");
        Produit produit2 = new ProduitNumerique("Coaching", 899, "0 MB", "Appel vidéo");
        Produit produit3 = new ProduitPhysique("Macbook", 1099, 200, "14x9x7");
        Produit produit4 = new ProduitPhysique("iPad", 799, 100, "10x2x3");

        monPanier.ajouterProduit(produit1);
        monPanier.ajouterProduit(produit2);
        monPanier.ajouterProduit(produit3);
        monPanier.ajouterProduit(produit4);

        monPanier.afficherContenu();
        System.out.println();
        System.out.println("Le total du panier : " + monPanier.calculerTotal() + "$");


    }
    public static void exo4smn3() {

        Scanner clavier = new Scanner(System.in);
        poo7.Bibliotheque maBibliotheque = new poo7.Bibliotheque();
        String optionQuitter = "d";
        String choix;

        do {

            System.out.println("Choisissez une option -->\n'a' : pour ajouter un livre\n'b' : pour rechercher un livre\n'c' : pour afficher tous les livres de la bibliothèque\n'd' : pour quitter le programme");
            choix = clavier.nextLine();

            switch (choix) {
                case "a":
                    System.out.print("Entrez le titre du livre à ajouter à la bibliothèque :");
                    String titre = clavier.nextLine();
                    System.out.print("Entrez l'auteur du livre (" + titre + ") à ajouter à la bibliothèque :");
                    String auteur = clavier.nextLine();
                    System.out.print("Entrez l'année de publication du livre (" + titre + ") à ajouter à la bibliothèque :");
                    int annee = clavier.nextInt();
                    clavier.nextLine();
                    poo7.Livre livre = new poo7.Livre(titre, auteur, annee);
                    maBibliotheque.ajouterLivre(livre);
                    break;
                case "b":
                    System.out.print("Voulez-vous faire une recherche par titre (t) ou par auteur (v) ? : ");
                    String recherche = clavier.nextLine();
                    switch (recherche) {
                        case "t":
                            System.out.print("Entrez le titre du livre à rechercher à la bibliothèque :");
                            String titreRecherche = clavier.nextLine();
                            maBibliotheque.rechercherLivreParTitre(titreRecherche);
                            break;
                        case "v":
                            System.out.print("Entrez l'auteur du livre à rechercher à la bibliothèque :");
                            String auteurRecherche = clavier.nextLine();
                            maBibliotheque.rechercherLivreParAuteur(auteurRecherche);
                            break;
                    }
                    break;
                case "c":
                    System.out.println("Voici tous les livres enregistrés dans la bibliothèque : ");
                    maBibliotheque.afficherTousLivres();
                    break;
            }

        } while (!choix.equals(optionQuitter));

    }
    public static void exo5smn3() {

        Scanner clavier = new Scanner(System.in);
        ListeEtudiants listeEtudiants = new ListeEtudiants();
        String optionQuitter = "q";
        String choix;

        do {
            System.out.println("Choisissez une option -->\n'a' : pour ajouter un étudiant à la liste\n'b' : pour rechercher un étudiant dans la liste\n'c' : pour afficher tous les étudiants de la liste\n'd' : pour modifier le détail d'un étudiants de la liste\n'e' : pour supprimer un étudiant de la liste\n'q' : pour quitter le programme");
            choix = clavier.nextLine();

            switch (choix) {
                case "a":
                    System.out.print("Entrez le nom de l'étudiant à ajouter à la liste :");
                    String nom = clavier.nextLine();
                    System.out.print("Entrez le prénom de l'étudiant (" + nom + ") à ajouter à la liste :");
                    String prenom = clavier.nextLine();
                    System.out.print("Entrez l'age de l'étudiant (" + nom + ") à ajouter à la liste :");
                    int age = clavier.nextInt();
                    clavier.nextLine();
                    System.out.print("Entrez la spécialité de l'étudiant (" + nom + ") à ajouter à la liste :");
                    String specialite = clavier.nextLine();
                    Etudiant etudiant = new Etudiant(nom, prenom, age, specialite);
                    listeEtudiants.ajouterEtudiant(etudiant);
                    break;
                case "b":
                    System.out.print("Voulez-vous faire une recherche par nom d'étudiant (n) ou par spécialité (v) ? : ");
                    String recherche = clavier.nextLine();
                    switch (recherche) {
                        case "n":
                            System.out.print("Entrez le nom du l'étudiant à rechercher à la liste :");
                            String nomRecherche = clavier.nextLine();
                            listeEtudiants.rechercherEtudiantParNom(nomRecherche);
                            break;
                        case "v":
                            System.out.print("Entrez la spécialité de l'étudiant à rechercher à la liste :");
                            String specialiteRecherche = clavier.nextLine();
                            listeEtudiants.rechercherEtudiantParSpecialite(specialiteRecherche);
                            break;
                    }
                case "c":
                    System.out.println("Voici tous les étudiants enregistrés dans la liste : ");
                    listeEtudiants.afficherEtudiants();
                    break;
                case "d":
                    System.out.println("Avant de modifier les détails de l'étudiant...");
                    ListeEtudiants.modifierDetailsEtudiant(ListeEtudiants.recupererEtudiant());
                    break;
                case "e":
                    System.out.println("Avant de supprimer les détails de l'étudiant...");
                    ListeEtudiants.supprimerEtudiant(ListeEtudiants.recupererEtudiant());
            }
        } while (!choix.equals(optionQuitter));
    }

    public static void smn4exo1() {

        ArrayList<Forme> listeForme = new ArrayList<>();
        listeForme.add(new Cercle(5d));
        listeForme.add(new Cercle(6.33d));
        listeForme.add(new Cercle(22d));
        listeForme.add(new Cercle(0.4d));
        listeForme.add(new Cercle(2.54d));
        listeForme.add(new Rectangle(4d, 7d));
        listeForme.add(new Rectangle(3.2d, 3d));
        listeForme.add(new Rectangle(4d, 8d));
        listeForme.add(new Rectangle(5.3d, 12d));
        listeForme.add(new Rectangle(6.0d, 3.54d));
        System.out.println("Attendu pour le premier : Aire = 78.54, Périmètre = 31.42");
        for (Forme forme : listeForme) {
            System.out.println("Aire = " + forme.calculerAire() + "\tPérimètre = " + forme.calculerPerimetre());
        }
    }
    public static void smn4exo2() {

        ArrayList<serie_1_2.Vehicule> listeVehicule = new ArrayList<>();
        listeVehicule.add(new serie_1_2.Voiture(180,4));
        listeVehicule.add(new serie_1_2.Avion(10000,180));
        listeVehicule.add(new serie_1_2.Bateau(500,30));
        for (serie_1_2.Vehicule veh : listeVehicule) {
            veh.seDeplacer();
            System.out.print(" ");
            veh.afficherInfos();
            System.out.println();
        }
    }
    public static void smn4exo3() {

        ArrayList<Paiement> listePaiements = new ArrayList<>();
        listePaiements.add(new PaiementCarteCredit("1173141412341234","John"));
        listePaiements.add(new PaiementPayPal("john.doe@example.com"));
        listePaiements.add(new PaiementVirement("12345678","XYZ"));
        for (Paiement p : listePaiements) {
            p.effectuerPaiement(100d);
        }
    }
    public static void smn4exo4() {

        List<Roulant> objetsRoulant = new ArrayList<>();
        List<Volant> objetsVolant = new ArrayList<>();

        Voiture voiture = new Voiture();
        Avion avion = new Avion();
        serie_1_4.Amphibie amphibie = new serie_1_4.Amphibie();

        objetsRoulant.add(voiture);
        objetsRoulant.add(amphibie);
        objetsVolant.add(avion);
        objetsVolant.add(amphibie);

        for (Roulant roulant : objetsRoulant) {
            roulant.rouler();
        }
        for (Volant volant : objetsVolant) {
            volant.voler();
        }



    }
    public static void smn4exo5() {
        List<Attaquant> equipe = new ArrayList<>();
        equipe.add(new Guerrier());
        equipe.add(new Archer());
        equipe.add(new Magicien());
        for (Attaquant attaquant : equipe) {
            attaquant.attaquer();
        }
    }
    public static void smn4exo6() {
        List<Mammifere> listeMammifere = new ArrayList<>();
        Chat chat1 = new Chat();
        Chien chien1 = new Chien();
        Chat chat2 = new Chat();
        Chien chien2 = new Chien();
        listeMammifere.add(chien1);
        listeMammifere.add(chien2);
        listeMammifere.add(chat1);
        listeMammifere.add(chat2);
        for (Mammifere m : listeMammifere) {
            m.manger();
            m.dormir();
            m.seDeplacer();
        }
    }
    public static void smn4exo7() {

        serie_1_7.Voiture voiture2 = new serie_1_7.Voiture();
        serie_1_7.Bateau bateau2 = new serie_1_7.Bateau();
        serie_1_7.Amphibie amphibie = new serie_1_7.Amphibie();

        List<VehiculeTerrestre> vehiculeTerrestre = new ArrayList<>();
        List<VehiculeAquatique> vehiculeAquatiques = new ArrayList<>();
        vehiculeTerrestre.add(voiture2);
        vehiculeTerrestre.add(amphibie);
        vehiculeAquatiques.add(bateau2);
        vehiculeAquatiques.add(amphibie);

        for (VehiculeTerrestre v : vehiculeTerrestre) {
            v.rouler();
        }
        for (VehiculeAquatique a : vehiculeAquatiques) {
            a.naviguer();
        }


    }

    public static void smn4exo2_1() {

        Bibliotheque bibliotheque = new Bibliotheque();
        serie_2_1.Livre livre1 = new serie_2_1.Livre("1984", "George Orwell", 1949);
        serie_2_1.Livre livre2 = new serie_2_1.Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943);
        serie_2_1.Livre livre3 = new serie_2_1.Livre("Harry Potter", "J.K. Rowling", 1997);

        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);
        bibliotheque.ajouterLivre(livre3);

        System.out.println("Liste des livres :");
        bibliotheque.afficherLivres();

        System.out.println("Liste triée par année de publication :");
        bibliotheque.trierParAnneePublication();
        bibliotheque.afficherLivres();

        System.out.println("Recherche du livre \"Harry Potter\" :");
        bibliotheque.rechercherLivreParTitre("Harry Potter");

        System.out.println("Après suppression :");
        bibliotheque.supprimerLivreParTitre("Harry Potter");
        bibliotheque.afficherLivres();



    }
}