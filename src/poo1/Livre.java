package poo1;

public class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;
    private boolean disponible;

    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.disponible = true;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public String getTitre() {
        return this.titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public int getAnneePublication() {
        return this.anneePublication;
    }

}
