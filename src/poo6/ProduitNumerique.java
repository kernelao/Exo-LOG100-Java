package poo6;

/**
 * Classe représentant un produit numérique, héritant de la classe Produit.
 * Contient des informations supplémentaires comme la taille et le type.
 *
 * @author kernelao
 * @version 1.0
 */
public class ProduitNumerique extends Produit {

    private String taille;
    private String type;

    /**
     * Constructeur de la classe ProduitNumerique.
     *
     * @param nom    le nom du produit
     * @param prix   le prix du produit
     * @param taille la taille du fichier (ex: "10 MB")
     * @param type   le type de produit (ex: "PDF", "Logiciel", etc.)
     */
    public ProduitNumerique(String nom, double prix, String taille, String type) {
        super(nom, prix);
        this.taille = taille;
        this.type = type;
    }

    /**
     * Affiche les informations du produit numérique, incluant nom, prix, taille et type.
     */
    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Taille: " + this.taille + "\nType: " + this.type + "\n");
    }
}