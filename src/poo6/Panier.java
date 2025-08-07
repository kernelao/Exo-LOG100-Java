package poo6;

import java.util.ArrayList;

public class Panier {

    private ArrayList<Produit> listeProduits;

    public Panier() {
        listeProduits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        listeProduits.add(produit);
    }

    public void afficherContenu() {
        for (Produit produit : listeProduits) {
            produit.afficherInfo();
        }
    }

    public double calculerTotal() {

        double total = 0;

        for (Produit produit : listeProduits) {
            total += produit.getPrix();
        }

        return total;
    }
}
