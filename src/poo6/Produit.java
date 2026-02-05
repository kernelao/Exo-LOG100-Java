package poo6;

public class Produit {

    private String nom;
    private double prix;

    public double getPrix() {
        return this.prix;
    }

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void afficherInfo() {
        System.out.println("Nom: " + this.nom + "\nPrix: " + this.prix);
    }
}
