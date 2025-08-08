package poo7;

public class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;

    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    public String getTitre() {
        return this.titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void afficherInfo() {
        System.out.println("Titre: " + this.titre + "\nAuteur: " + this.auteur + "\nAnnée de publication: " + this.anneePublication);
    }



}
