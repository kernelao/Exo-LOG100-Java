package poo5;

/**
 * Classe représentant une entreprise, héritant de la classe Contact.
 * Contient des informations supplémentaires comme le secteur d’activité et l’adresse.
 *
 * @author kernelao
 * @version 1.0
 */
public class Entreprise extends Contact {

    private String secteur;
    private String adresse;

    /**
     * Constructeur de la classe Entreprise.
     *
     * @param nom      le nom de l’entreprise
     * @param email    l’adresse email de l’entreprise
     * @param secteur  le secteur d’activité
     * @param adresse  l’adresse de l’entreprise
     */
    public Entreprise(String nom, String email, String secteur, String adresse) {
        super(nom, email);
        this.secteur = secteur;
        this.adresse = adresse;
    }

    /**
     * Affiche les informations de l’entreprise : nom, email, secteur et adresse.
     */
    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Secteur: " + this.secteur + "\nAdresse: " + this.adresse + "\n");
    }

}
