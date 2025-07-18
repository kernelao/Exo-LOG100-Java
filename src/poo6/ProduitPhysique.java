package poo6;

public class ProduitPhysique extends Produit {

    private double poids;
    private String dimension;

    public ProduitPhysique(String nom, double prix, double poids, String dimension) {
        super(nom, prix);
        this.poids = poids;
        this.dimension = dimension;
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Poids: " + this.poids + "\nDimension: " + this.dimension);
    }
}
