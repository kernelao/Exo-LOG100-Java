package poo5;

public class Entreprise extends Contact {

    private String secteur;
    private String adresse;

    public Entreprise(String nom, String email, String secteur, String adresse) {
        super(nom, email);
        this.secteur = secteur;
        this.adresse = adresse;
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Secteur: " + this.secteur + "\nAdresse: " + this.adresse);
    }

}
