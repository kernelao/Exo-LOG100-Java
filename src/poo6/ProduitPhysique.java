package poo6;

/**
 * Classe représentant un produit physique, héritant de la classe Produit.
 * Contient des informations supplémentaires comme le poids et les dimensions.
 *
 * @author kernelao
 * @version 1.0
 */
public class ProduitPhysique extends Produit {

    private double poids;
    private String dimension;

    /**
     * Constructeur de la classe ProduitPhysique.
     *
     * @param nom       le nom du produit
     * @param prix      le prix du produit
     * @param poids     le poids du produit
     * @param dimension les dimensions du produit (ex: "10x5x3")
     */
    public ProduitPhysique(String nom, double prix, double poids, String dimension) {
        super(nom, prix);
        this.poids = poids;
        this.dimension = dimension;
    }

    /**
     * Affiche les informations du produit physique, incluant nom, prix, poids et dimensions.
     */
    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Poids: " + this.poids + "\nDimension: " + this.dimension + "\n");
    }
}
