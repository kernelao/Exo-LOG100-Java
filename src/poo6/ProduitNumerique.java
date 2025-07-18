package poo6;

public class ProduitNumerique extends Produit {

    private String taille;
    private String type;

    public ProduitNumerique(String nom, double prix, String taille, String type) {
        super(nom, prix);
        this.taille = taille;
        this.type = type;
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Taille: " + this.taille + "\nType: " + this.type);
    }
}