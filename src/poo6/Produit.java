package poo6;

/**
 * Classe représentant un produit de base avec un nom et un prix.
 * Classe mère pour les produits physiques et numériques.
 *
 * @author kernelao
 * @version 1.0
 */
public class Produit {

    private String nom;
    private double prix;

    /**
     * Constructeur de la classe Produit.
     *
     * @param nom  le nom du produit
     * @param prix le prix du produit
     */
    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // Getter - accesseur
    public double getPrix() {
        return this.prix;
    }

    /**
     * Affiche les informations du produit (nom et prix).
     */
    public void afficherInfo() {
        System.out.println("Nom: " + this.nom + "\nPrix: " + this.prix);
    }
}
