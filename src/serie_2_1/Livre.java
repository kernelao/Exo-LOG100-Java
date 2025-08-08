package serie_2_1;

public class Livre {
    private String titre;
    private String auteur;
    private int aneePublication;

    public Livre(String titre, String auteur, int aneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.aneePublication = aneePublication;
    }

    public String getTitre() {
        return this.titre;
    }

    public int getAnneePublication()  {
        return this.aneePublication;
    }

    public String toString() {
        return "[Titre: " + this.titre + ", Auteur: " + this.auteur + ", Année :" + this.aneePublication + "]";
    }
}
