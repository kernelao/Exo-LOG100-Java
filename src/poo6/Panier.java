package poo6;

import java.util.ArrayList;

/**
 * Classe représentant un panier contenant une liste de produits.
 * Permet d'ajouter des produits, d'afficher leur contenu et de calculer le total.
 *
 * @author kernelao
 * @version 1.0
 */
public class Panier {

    private ArrayList<Produit> listeProduits;

    /**
     * Constructeur du panier qui initialise la liste des produits.
     */
    public Panier() {
        listeProduits = new ArrayList<>();
    }

    /**
     * Ajoute un produit à la liste du panier.
     *
     * @param produit le produit à ajouter
     */
    public void ajouterProduit(Produit produit) {

        if (produit == null) {
            System.out.println("Erreur d'ajout - le produit n'existe pas (null)");
            return;
        }
        listeProduits.add(produit);
    }

    /**
     * Affiche les informations de tous les produits du panier.
     */
    public void afficherContenu() {

        if (listeProduits.isEmpty()) {
            System.out.println("La liste des produits est vide !");
            return;
        }

        for (Produit produit : listeProduits) {
            produit.afficherInfo();
        }
    }

    /**
     * Calcule et retourne le prix total de tous les produits dans le panier.
     *
     * @return le total des prix
     */
    public double calculerTotal() {

        if (listeProduits.isEmpty()) {
            System.out.println("La liste des produits est vide !");
            return 0;
        }

        double total = 0;

        for (Produit produit : listeProduits) {
            total += produit.getPrix();
        }
        return total;
    }
}
